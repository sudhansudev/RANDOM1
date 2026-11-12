public class reverse_arr 
{
    public static void main(String[] args)
    {
        //reverse array
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println("elements are : ");
        for(int i = n-1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
        
}
