public class array2 
{
    public static void main(String[] args)
    {
        // primitive array
        int[] arr = {10,20,30,40};
        int n = arr.length;
        System.out.print("primitive-array -> ");
        for(int i = 0; i < n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        //for the next line
        System.out.println();
        //non - primitive array
        System.out.print("non-primitive arrys -> ");
        String[] names = {"tyson", "sonu", "monu"};
        
        for(int i = 0; i < names.length; i++)
        
            System.out.print(names[i] +" ");

     System.out.println();
     int[] arr1 = {10,20,30};
      //updating the array index value
     arr1[0] = 90;
     System.out.println(arr1[0]);
        
    }    
    
    
}
