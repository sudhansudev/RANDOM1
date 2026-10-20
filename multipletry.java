public class multipletry 
{
    public static void main(String [] args)
    {
        try
        {
            int a = 10, b = 0 , c;
            c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException a)
        {
            System.out.println("can't divide by zero");
        }

        try
        {
            int a[] = {10,20,30,40}; 
            System.out.println(a[4]); 
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("can't access out of the bound of an array .");
        }
    }   
}
