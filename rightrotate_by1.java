import java.util.Arrays;
public class rightrotate_by1 
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
    // index value = 0,1,2,3,4
        int size = arr.length;//size = 5

        int temp = arr[size -1];//last value stored in temp
        for(int i = size -2; i >= 0 ; i--)
        {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }   
}
