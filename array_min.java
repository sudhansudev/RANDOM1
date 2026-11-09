public class array_min 
{
    public static void main()
    {
        int[] arr = {20,30,50,40,100};
        int min = arr[0];
        int minIndex = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
                minIndex = i;//to find the index number of the min value 
            }
        }
        System.out.println("min is : " +min);
        System.out.println(minIndex);
        //alternative way
        //we can use the minimum value of any data-ype
        // we will use MIN_VALUE
        //MIN_VALUE of integer is -2147483648.
        int min1 = Integer.MIN_VALUE;
        
        System.out.println(min1);
    }
}
