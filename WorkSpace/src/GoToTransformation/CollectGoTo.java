package GoToTransformation;

import javafx.util.Pair;
import org.objectweb.asm.*;
import org.objectweb.asm.commons.GeneratorAdapter;

import java.util.ArrayList;
import java.util.HashMap;


public class CollectGoTo extends ClassVisitor {
    public static ArrayList<InstructionCollector> instructionCollectors = new ArrayList<>();

    VisitorPass visitorPass;

    //second pass related vairables
    HashMap<Integer, ModifiedGoTo> goToInsHashMap = new HashMap<>();

    /*public CollectGoTo(int api) {
        super(Opcodes.ASM5);
    }*/

    public CollectGoTo(ClassVisitor cv) {
        super(Opcodes.ASM5, cv);
    }


    public CollectGoTo(ClassVisitor cv, ArrayList<Pair<Integer, Label>> collectedJumpInstructions, ArrayList<Label>            backEdgeTargetLabels) {
        super(Opcodes.ASM5, cv);
        goToInsHashMap = ModifiedGoTo.create(collectedJumpInstructions, backEdgeTargetLabels);
    }


    public static byte[] execute(byte[] b) {
        ClassReader classReader = new ClassReader(b);
        final ClassWriter cw = new ClassWriter(classReader, ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        CollectGoTo classVisitor = new CollectGoTo(cw);
        classVisitor.visitorPass = VisitorPass.READINGPASS;

        classReader.accept(classVisitor, ClassReader.EXPAND_FRAMES);

        //System.out.println("visited jump instructions in method: " + name + signature);
        for (InstructionCollector instructionCollector : instructionCollectors) {
            ArrayList<Pair<Integer, Label>> collectedJumpInstructions = instructionCollector.collectedJumpInstructions;
            ArrayList<Label> backEdgeTargetLabels = instructionCollector.backEdgeTargetLabel;
        }

            if (backEdgeTargetLabels.size() > 0) { // discovered backedge in the method, try to rewrite.
                final ClassWriter goToWriter = new ClassWriter(classReader, ClassWriter.COMPUTE_FRAMES | ClassWriter
                        .COMPUTE_MAXS);

                CollectGoTo writerVisitor = new CollectGoTo(cw, collectedJumpInstructions, backEdgeTargetLabels);
                classVisitor.visitorPass = VisitorPass.WRITINGPASS;
                classReader.accept(writerVisitor, ClassReader.EXPAND_FRAMES);
                return goToWriter.toByteArray();
            }
            else
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
        public ArrayList<Pair<Integer, Label>> collectedJumpInstructions = new ArrayList<>();

        public ArrayList<Label> seenLabels = new ArrayList<>();

        // indicates the number of goto that we have encountered so far.
        public int goToOrdNum = 0;

        public ArrayList<Label> backEdgeTargetLabel = new ArrayList<>();

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
                            this.mv.visitLabel(modifiedGoTo.jumpLabel);
                            this.mv.visitJumpInsn(opcode, label);
                            return;
                        } else { // if it is not the last then lets visit the goTo with the new target created for it.
                            this.mv.visitJumpInsn(opcode, modifiedGoTo.jumpLabel);
                            return;
                        }
                    }
                    this.mv.visitJumpInsn(opcode, label);
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
}
