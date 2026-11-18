import java.util.Arrays;
class Solution {
    public void rotate(int[] nums, int k) 
    {  
      int size = nums.length;
      int last_index = size - 1;
      
      k = k % size;
      for(int j = 1; j <=k ; j++)
      {
        int temp = nums[last_index];
        for(int i = size - 2; i >= 0; i--)
        {
        nums[i + 1] = nums[i];
        }
       nums[0] = temp;
      }
    
    }
        
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,6,7};
         Solution obj = new Solution();
         obj.rotate(nums,1);
         System.out.println(Arrays.toString(nums));
    }  
}   

