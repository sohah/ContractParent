package GoToTransformation;

import javafx.util.Pair;
import org.objectweb.asm.*;
import org.objectweb.asm.commons.GeneratorAdapter;

import java.util.ArrayList;


public class CollectGoTo extends ClassVisitor {
    public static ArrayList<InstructionCollector> instructionCollectors = new ArrayList<>();

    /*public CollectGoTo(int api) {
        super(Opcodes.ASM5);
    }*/

    public CollectGoTo(ClassVisitor cv) {
        super(Opcodes.ASM5, cv);
    }

    public static void execute(byte[] b) {
        ClassReader classReader = new ClassReader(b);
        final ClassWriter cw = new ClassWriter(classReader, ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        classReader.accept(new CollectGoTo(cw), ClassReader.EXPAND_FRAMES);

        //System.out.println("visited jump instructions in method: " + name + signature);
        for (InstructionCollector instructionCollector : instructionCollectors) {
            ArrayList<Pair<Integer, Label>> collectedJumpInstructions = instructionCollector.collectedJumpInstructions;
            ArrayList<Label> seenLabels = instructionCollector.seenLabels;
            ArrayList<Label> backEdgeTargetLabel = instructionCollector.backEdgeTargetLabel;


            System.out.println("visited jump instructions in method: ");
            System.out.println(collectedJumpInstructions.toString());

            System.out.println("visited labels:");
            System.out.println(seenLabels);

            System.out.println("backedge target labels:");
            System.out.println(backEdgeTargetLabel);
        }
    }


    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        MethodVisitor v = super.visitMethod(access, name, desc, signature, exceptions);
        if (name.equals("testWhileProblem4")) {
            v = new InstructionCollector(v, access, name, desc, signature, exceptions);
            CollectGoTo.instructionCollectors.add((InstructionCollector) v);
        }

        return v;
    }

    class InstructionCollector extends GeneratorAdapter {
        public ArrayList<Pair<Integer, Label>> collectedJumpInstructions = new ArrayList<>();

        public ArrayList<Label> seenLabels = new ArrayList<>();

        // indicates the number of goto that we have encountered so far.
        public int goToOrdNum = 0;

        public ArrayList<Label> backEdgeTargetLabel = new ArrayList<>();

        InstructionCollector(MethodVisitor delegate, int access, String name, String desc, String signature, String[] exceptions) {
            super(Opcodes.ASM5, delegate, access, name, desc);
        }

        @Override
        public void visitJumpInsn(int opcode, Label label) {
            if (this.mv != null) {
                if (opcode == 167) { // is a goTo instruction.
                    ++goToOrdNum;
                    if (isBackEdgeLabel(label)) {
                        if (!backEdgeTargetLabel.contains(label))
                            backEdgeTargetLabel.add(label);
                        collectedJumpInstructions.add(new Pair<>(goToOrdNum, label));
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
}
