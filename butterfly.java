public class butterfly 
{
    public static void butter()
    {
        int n = 4;
        //upper half

        //outer loop
        for(int i = 1; i <= n; i++)
        {
            //1st part
            //inner loop
            //upper 1st half
            for(int j = 1; j <= i; j++)
            {
                //print " * "
                System.out.print("*");
            }

            //spaces
            int space = 2*(n-i);
            for(int j = 1; j <= space; j++)
            {
                System.out.print(" ");
            }

            //upper 2nd half
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }

        //lower half

        //outer half
        for(int i = n; i >= 1; i--)
        {
            //inner loop
            //lower first half
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            //spaces
            int space = 2*(n-i);
            for(int j = 1; j <= space; j++)
            {
                System.out.print(" ");
            }
            
            //lower 2nd half
            for(int j = 1; j<= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }




    public static void main(String[] args)
    {
        butter();
    }    
}
