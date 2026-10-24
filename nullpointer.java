public class nullpointer
{
    public static void main(String [] a)
    {
        String str = null;
        try
        {
            System.out.println(str.toUpperCase());
        }
        catch(NullPointerException e)
        {
            System.out.println("null can't be casted.");
        }
    }
}
