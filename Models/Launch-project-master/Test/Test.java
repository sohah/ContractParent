class IntFunction
{
    public static int intCheck(String s)
    {
        if (s.equals("Activate"))
        {
            return 0;
        }
        return 1;
    }
    public static void main(String[] args)
    {
        String str = "Activate";
        if (intCheck(str) == 0)
        {
            intCheck(str);
        }
        else
        {
            System.out.println(5);
        }
    }
}
