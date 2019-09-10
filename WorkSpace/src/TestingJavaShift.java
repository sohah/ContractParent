import java.util.BitSet;

public class TestingJavaShift {


    public int sheepAndGoatLeft(int i) {
        int j = 0;

        System.out.println(Integer.toBinaryString(i));

        while (i != 0) {
            int zeroNum = Integer.numberOfTrailingZeros(i);
            if (zeroNum != 0) {
                i = i >> Integer.numberOfTrailingZeros(i);
            } else {
                j = j >>> 1;
                j = j ^ (Integer.reverse(1));
                i = i >> 1;
            }
        }

        System.out.println(Integer.toBinaryString(j));
        return j;

    }

    public int sheepAndGoatRight(int i) {
        int j = 0;
        System.out.println(Integer.toBinaryString(i));

        while (i != 0) {
            if (Integer.numberOfTrailingZeros(i) != 0) {
                i = i >> Integer.numberOfTrailingZeros(i);
            } else {
                j = j << 1;
                j = j ^ 1;
                i = i >> 1;
            }
        }

        System.out.println(Integer.toBinaryString(j));
        return j;
    }

    public int sheepAndGoatLeftNoTrail(int i) {
        int j = 0;

        System.out.println(Integer.toBinaryString(i));

        while (i != 0) {
            if (i%2 == 0) {
                i = i >> 1;
            } else {
                j = j >>> 1;
                j = j ^ (Integer.reverse(1));
                i = i >> 1;
            }
        }

        System.out.println(Integer.toBinaryString(j));
        return j;

    }


    // Driver code
    public static void main(String[] args) {

        System.out.println("Left Sheep and Goat");
        (new TestingJavaShift()).sheepAndGoatLeft(214);

        System.out.println("Right Sheep and Goat");
        (new TestingJavaShift()).sheepAndGoatRight(214);

        System.out.println("left Sheep and Goat No Trail");
        (new TestingJavaShift()).sheepAndGoatLeftNoTrail(214);
    }
}
