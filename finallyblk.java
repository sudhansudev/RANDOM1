public class finallyblk 
{
    public static void main(String[] args) 
    {
        try
        {
            int a = 10 , b = 0 , c;
            c = a / b;
            System.out.println(c);
        }

        catch(ArithmeticException a)
        {
             int x = 10 , y = 0 , z;
            z = x / y;
            System.out.println(z);
            System.out.println("can't devide by zero ...");
        }
             
        finally
        {
             int a = 10 , b = 0 , c;
            c = a / b;
            System.out.println(c);
            System.out.println("database connected successfully.");
        }
        System.out.println("main thread ended .");
    }
}
