public class arraymax 
{
    public static void main()
    {
        // Max for positive elements
        int max = 0;
        int[] arr = {10,30,50,40};
        for(int i = 0 ; i < arr.length; i++)
        {
            if(arr[i] > max)
                max = arr[i];
            
        }
        System.out.println("maximum value in the array is : " + max);

        //alternative way
        // use MAX_VALUE of any data type
        int max2 = Integer.MAX_VALUE;
        System.out.println(max2);//give 2147483647.

        // Max for negative elements
        // For negative we can't assign max = 0 
        // As 0 is maximum among all the negative numbers
        // arr[] = {-1, -2, -3, -4}
        // Here 0  is greater than other negative numbers 
        // we will assign the max = arr[0] to first element of array
        int[] arr1 = {-1,-7,-3,-2,0};
        int max1 = arr1[0];
        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] > max1)
            {
                max1 = arr1[i];
            }
        }
        System.out.println("maximum value among negative array is : " +max1);
    }    
}
