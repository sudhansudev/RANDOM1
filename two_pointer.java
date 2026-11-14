import java.util.Arrays;

public class two_pointer 
{
    public static void main(String[] args)
    {
        //two pointer approach
        int[] arr = {1,2,3,4,5};
        int end = arr.length-1;
        int start = 0;

        while(start < end)
        {
            //swap value
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }    
}
