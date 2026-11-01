public class floyd
{
    public void pattern()
    {
        int n = 5;
        int num = 1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i ; j++)
            {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }  
    public static void main(String[] args)
    {
        floyd obj = new floyd();

        obj.pattern();
    }
}
