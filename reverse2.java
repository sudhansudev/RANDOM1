import java.util.Arrays;

public class reverse2 
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int[] rev = new int[arr.length];
        int j = 0;
        int n = arr.length;
        for(int i = n-1 ; i >= 0; i--)
        {
            rev[j++] = arr[i];// to assign the value in reverse order
            //j++ is alternative .
        }
        System.out.println("the reverse arrray elements are : ");
        for(int i = 0 ; i < rev.length; i++)
        {
            System.out.print(rev[i] + " ");
        }
        System.out.println();
        //toSrting method in array
        System.out.println(Arrays.toString(rev));
    }   
}
