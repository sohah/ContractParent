public class TestCasePerf {

    public static void main(String[] args) {
        (new TestCasePerf()).unoptimalDFS(1, 1);
    }

    public int singleBranchCov(int x, int y) {

        A a = new A();

        for (int i = 0; i < 2; i++) {
            if (x == 1)
                x = y;
            else x = x + a.fibA(2);
        }
//          Debug.printPC("printing pc at the end of the path");
        return x;
    }

    public int doubleLoop(int x, int y) {

        int j = 0;
        for (int i = 0; i < 2; i++) {
            while (j < 4) {
                x = x + 1;
                j++;
            }
        }
        return x;
    }


    public int unoptimalDFS(int x, int y) {
        if (x == y)
            return 1;

        for (int i = 0; i < 2; i++) {
            if (x == 1)
                x = y + 3;
            else if (y > 1)
                x = x + 1;
            else
                x = x + 2;
        }
        return x;
    }

}
