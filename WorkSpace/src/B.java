public class B {

    int b;
    A aRef = new A();

    public int getIncB(){
        return ++b;
    }

    public int getIncA(){
        return aRef.getIncB();
    }

    public int fibB(int n){
        if (n <= 1)
            return n;
        return fibB(n-1) + fibB(n-2);
    }
}
