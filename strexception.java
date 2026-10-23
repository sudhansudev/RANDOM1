public class strexception 
{
    public static void main(String [] args)
    {
        String str = "123";
        try
        {
            int s = Integer.parseInt(str);
            System.out.println(s);
        }

        catch(NumberFormatException n)
        {
            System.out.println("string " + str + " can't be converted into integer .");
        }
        
    }
}
