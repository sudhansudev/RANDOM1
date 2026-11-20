public class linear_search 
{
    public static int linear(int[] arr,int target) 
    {
    
       int size = arr.length;
       for(int i = 0 ; i < size ; i++)
        {
            if(arr[i] == target)
             {
                return i;//return index value
             }
        
       }
       return -1;// for integer we return -1 same as false.

    }
    
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5};
        int target = 5;
        int result = linear(arr,target);

        if(result != -1)
        {
            System.out.println("found at index :" + result);
        }
        else
        {
            System.out.println("not present.");
        }
    }
}
