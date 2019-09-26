package GoToTransformation;

import javafx.util.Pair;
import org.objectweb.asm.*;
import org.objectweb.asm.commons.GeneratorAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class CollectGoTo extends ClassVisitor {
    public static ArrayList<InstructionCollector> instructionCollectors = new ArrayList<>();

    VisitorPass visitorPass;

    //second pass related vairables
    HashMap<Integer, ModifiedGoTo> goToInsHashMap = new HashMap<>();

    ArrayList<Label> newLabels = new ArrayList<>();

    /*public CollectGoTo(int api) {
        super(Opcodes.ASM5);
    }*/

    public CollectGoTo(ClassVisitor cv) {
        super(Opcodes.ASM5, cv);
        this.visitorPass = VisitorPass.READINGPASS;
    }


    public CollectGoTo(ClassVisitor cv, ArrayList<Pair<Integer, Label>> collectedJumpInstructions, ArrayList<Label> backEdgeTargetLabels) {
        super(Opcodes.ASM5, cv);
        this.visitorPass = VisitorPass.WRITINGPASS;
        Pair newGoToAndLabelsPair = ModifiedGoTo.create(collectedJumpInstructions, backEdgeTargetLabels);
        newLabels = (ArrayList<Label>) newGoToAndLabelsPair.getKey();
        goToInsHashMap = (HashMap<Integer, ModifiedGoTo>) newGoToAndLabelsPair.getValue();
    }


    public static byte[] execute(byte[] b) {
        ClassReader classReader = new ClassReader(b);
        final ClassWriter cw = new ClassWriter(classReader, ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        CollectGoTo firstPassClassVisitor = new CollectGoTo(cw);

        classReader.accept(firstPassClassVisitor, ClassReader.EXPAND_FRAMES);


        ArrayList<Pair<Integer, Label>> collectedJumpInstructions = new ArrayList<>();
        ArrayList<Label> backEdgeTargetLabels = new ArrayList<>();

        //System.out.println("visited jump instructions in method: " + name + signature);
        for (InstructionCollector instructionCollector : instructionCollectors) {
            collectedJumpInstructions = instructionCollector.collectedJumpInstructions;
            backEdgeTargetLabels = instructionCollector.backEdgeTargetLabel;
        }

        if (backEdgeTargetLabels.size() > 0) { // discovered backedge in the method, try to rewrite.
                /*ClassReader newClassReader = new ClassReader(b);
                final ClassWriter goToWriter = new ClassWriter(newClassReader, ClassWriter.COMPUTE_FRAMES | ClassWriter
                        .COMPUTE_MAXS);

                CollectGoTo goToVisitorPass = new CollectGoTo(goToWriter, collectedJumpInstructions,
                        backEdgeTargetLabels);
                goToVisitorPass.visitorPass = VisitorPass.WRITINGPASS;
                newClassReader.accept(goToVisitorPass, ClassReader.EXPAND_FRAMES);
                return goToWriter.toByteArray();*/

            ClassReader newClassReader = new ClassReader(b);
            final ClassWriter newcw = new ClassWriter(newClassReader, ClassWriter.COMPUTE_FRAMES | ClassWriter
                    .COMPUTE_MAXS);
            CollectGoTo secPassClassVisitor = new CollectGoTo(newcw, collectedJumpInstructions, backEdgeTargetLabels);
            newClassReader.accept(secPassClassVisitor, ClassReader.EXPAND_FRAMES);
            return newcw.toByteArray();

        } else
            return cw.toByteArray();
/*

            System.out.println("visited jump instructions in method: ");
            System.out.println(collectedJumpInstructions.toString());

            System.out.println("visited labels:");
            System.out.println(seenLabels);

            System.out.println("backedge target labels:");
            System.out.println(backEdgeTargetLabels);
*/

    }


    /*@Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        MethodVisitor v = super.visitMethod(access, name, desc, signature, exceptions);
        if (name.equals("testWhileProblem4")) {
            v = new InstructionCollector(v, access, name, desc, signature, exceptions);
            CollectGoTo.instructionCollectors.add((InstructionCollector) v);
        }

        return v;
    }*/


    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        MethodVisitor v = super.visitMethod(access, name, desc, signature, exceptions);
        if (name.equals("testWhileProblem4")) {
            if (visitorPass == VisitorPass.READINGPASS) {
                v = new InstructionCollector(v, access, name, desc, signature, exceptions);
                CollectGoTo.instructionCollectors.add((InstructionCollector) v);
            } else { //writing pass
                assert (visitorPass == VisitorPass.WRITINGPASS);
                v = new GoToWriter(v, access, name, desc, signature, exceptions);
            }
        }
        return v;
    }


    class InstructionCollector extends GeneratorAdapter {
        public ArrayList<Pair<Integer, Label>> collectedJumpInstructions = new ArrayList<>();

        public ArrayList<Label> seenLabels = new ArrayList<>();

        // indicates the number of goto that we have encountered so far.
        public int goToPos = 0;

        public ArrayList<Label> backEdgeTargetLabel = new ArrayList<>();

        InstructionCollector(MethodVisitor delegate, int access, String name, String desc, String signature, String[] exceptions) {
            super(Opcodes.ASM5, delegate, access, name, desc);
        }

        @Override
        public void visitJumpInsn(int opcode, Label label) {
            if (this.mv != null) {
                if (opcode == 167) { // is a goTo instruction.
                    ++goToPos;
                    if (isBackEdgeLabel(label)) {
                        if (!backEdgeTargetLabel.contains(label))
                            backEdgeTargetLabel.add(label);
                        collectedJumpInstructions.add(new Pair<>(goToPos, label));
                    }
                }
                this.mv.visitJumpInsn(opcode, label);
            }
        }

        private boolean isBackEdgeLabel(Label label) {
            return (seenLabels.contains(label));
        }

        public void visitLabel(Label label) {
            if (this.mv != null) { //collecting all encountered labels.
                seenLabels.add(label);
                this.mv.visitLabel(label);
            }
        }

    }


    class GoToWriter extends GeneratorAdapter {

        // indicates the number of goto that we have encountered so far.
        public int goToOrdNum = 0;
        private int currentLine;

        GoToWriter(MethodVisitor delegate, int access, String name, String desc, String signature, String[]
                exceptions) {
            super(Opcodes.ASM5, delegate, access, name, desc);
        }

        @Override
        public void visitJumpInsn(int opcode, Label label) {
            if (this.mv != null) {
                if (opcode == 167) { // is a goTo instruction.
                    ++goToOrdNum;
                    ModifiedGoTo modifiedGoTo = goToInsHashMap.get(goToOrdNum);
                    if (modifiedGoTo != null) { // if it is in the modifiedGoToHashMap
                        if (modifiedGoTo.isLastGoTo) { //if it is the last goTo then we need to visit the newLabel first before we visit the instruction.
                            super.mv.visitLabel(modifiedGoTo.jumpLabel);
                            super.mv.visitLineNumber(currentLine,modifiedGoTo.jumpLabel);
                            super.mv.visitJumpInsn(opcode, label);
                            return;
                        } else { // if it is not the last then lets visit the goTo with the new target created for it.
                            super.mv.visitJumpInsn(opcode, modifiedGoTo.jumpLabel);
                            super.mv.visitLabel(modifiedGoTo.jumpLabel);
                            return;
                        }
                    }
                }
                this.mv.visitJumpInsn(opcode, label);
            }
        }

        @Override
        public void visitLineNumber(int line, Label start) {
            mv.visitLineNumber(line, start);
             currentLine = line;
        }
    }
}
