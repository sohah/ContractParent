// Java implementation to
// reverse bits of a number
class GFG
{
    // function to reverse bits of a number
    public static int reverseBits(int n)
    {
        int rev = 0;

        // traversing bits of 'n'
        // from the right
        while (n > 0)
        {
            // bitwise left shift
            // 'rev' by 1
            rev <<= 1;

            // if current bit is '1'
            if ((int)(n & 1) == 1)
                //rev ^= 1;
                rev = Integer.sum(rev,1);

            // bitwise right shift
            //'n' by 1
            n >>= 1;
        }
        // required number
        return rev;
    }



    // Driver code
    public static void main(String[] args)
    {
        int n = 11;
        System.out.println("i: " + String.format("%32s",
                Integer.toBinaryString(n)).replaceAll(" ", "0"));
        int reversedN = reverseBits(n);
        System.out.println("i: " + String.format("%32s",
                Integer.toBinaryString(reversedN)).replaceAll(" ", "0"));

        System.out.println(reversedN);
    }
}

// This code is contributed
// by prerna saini.
