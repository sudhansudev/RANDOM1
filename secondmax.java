public class secondmax 
{
    public static void main(String[] args)
    {
        int[] arr = {40,40,40};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                secMax = max;
                max = arr[i];
            }
            else if(arr[i] > secMax && arr[i] <= max)
            {
                secMax = arr[i];
            }
        }
        System.out.println("max is = " +max);
        System.out.println("second max = " +secMax);
    }
}
