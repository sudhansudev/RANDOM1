public class left_triangle 
{
    public static void left()
    {
        int n = 5;
        int m = 5;
        //outer loop
        for(int i = 5; i >= 1; i--)
        {
            //inner loop
            for(int j = 1 ; j <= i; j++)
            {

                System.out.print(" * ");

            }

            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        left();
    }   
}
