package GoToTransformation;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import org.objectweb.asm.*;
import org.objectweb.asm.commons.GeneratorAdapter;

import static org.objectweb.asm.Opcodes.*;

public class MyTransformer extends ClassVisitor {

    public static byte[] transform(byte[] b) {
        final ClassReader classReader = new ClassReader(b);
        final ClassWriter cw = new ClassWriter(classReader, ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        classReader.accept(new MyTransformer(cw), ClassReader.EXPAND_FRAMES);
        return cw.toByteArray();
    }

    public MyTransformer(ClassVisitor cv) {
        super(Opcodes.ASM5, cv);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {

        MethodVisitor v = super.visitMethod(access, name, desc, signature, exceptions);
        if (name.equals("main") && desc.equals("([Ljava/lang/String;)V"))
            v = new MainTransformer(v, access, name, desc, signature, exceptions);
        return v;
    }
   /*@Override
    public void visitEnd() {
        appendShowTwo();
        super.visitEnd();
    }
*/
    private void appendShowTwo() {
        final MethodVisitor defVisitor = super.visitMethod(Opcodes.ACC_PUBLIC, "showTwo", "()V", null, null);
        defVisitor.visitVarInsn(ILOAD, 1);
        Label label = new Label();
        defVisitor.visitJumpInsn(IFLT, label);
        defVisitor.visitVarInsn(ALOAD, 0);
        defVisitor.visitVarInsn(ILOAD, 1);
        defVisitor.visitFieldInsn(PUTFIELD, "pkg/Bean", "f", "I");
        Label end = new Label();
        defVisitor.visitJumpInsn(GOTO, end);
        defVisitor.visitLabel(label);
        defVisitor.visitFrame(F_SAME, 0, null, 0, null);
        defVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
        defVisitor.visitInsn(DUP);
        defVisitor.visitMethodInsn(INVOKESPECIAL,
                "java/lang/IllegalArgumentException", "<init>", "()V");
        defVisitor.visitInsn(ATHROW);
        defVisitor.visitLabel(end);
        defVisitor.visitFrame(F_SAME, 0, null, 0, null);
        defVisitor.visitInsn(RETURN);
        defVisitor.visitMaxs(2, 2);
        defVisitor.visitEnd();
    }


    class MainTransformer extends GeneratorAdapter {
        MainTransformer(MethodVisitor delegate, int access, String name, String desc,
                        String signature, String[] exceptions) {
            super(Opcodes.ASM5, delegate, access, name, desc);
        }


        @Override
        public void visitCode(){
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(16, l0);
            mv.visitIntInsn(SIPUSH, 10000);
            mv.visitVarInsn(ILOAD, 2);
            mv.visitVarInsn(ILOAD, 2);
            mv.visitInsn(IMUL);
            mv.visitInsn(ISUB);
            mv.visitInsn(I2D);
            mv.visitMethodInsn(INVOKESTATIC,
                    "java/lang/Math", "sqrt",
                    "(D)D", false);
            mv.visitInsn(D2I);
            mv.visitVarInsn(ISTORE, 3);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(17, l1);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitVarInsn(ILOAD, 3);
            mv.visitVarInsn(ILOAD, 2);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESPECIAL,
                    "de/beyondjava/demos/bytecode/CircleWithoutImplementation",
                    "draw8Pixels", "(IILjava/awt/Graphics;)V", false);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitEnd();
        }
        /*@Override
        public void visitInsn(int opcode) {
            if (opcode == Opcodes.RETURN) {
                // before return insert c.showTwo();
                super.visitVarInsn(ALOAD, 1); // variable c
                super.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "ClassName", "showTwo", "()V", false);
            }
        }*/
    }
}