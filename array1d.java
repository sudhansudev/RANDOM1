public class array1d
{
    public static void main(String [] agrs)
    {
        // 
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}}; 
        
        for(int i = 0 ; i <=3; i++)
        {
            for(int j = 0 ; j <= 2; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int n[] : arr)
        {
            for(int m : n)
            {
                System.out.print(m + "  ");
            }
            System.out.println();
        }
    }
}