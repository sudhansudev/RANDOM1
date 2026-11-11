public class sorted 
{
    public static void main(String[] args)
    {
        // array sorting ascending order
        int[] arr = {3,2,8,9,16};
        boolean isSorted = true;
        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i] > arr[i + 1])
            {
                isSorted = false;
            }
        }
        System.out.println(isSorted);
    }   
}
