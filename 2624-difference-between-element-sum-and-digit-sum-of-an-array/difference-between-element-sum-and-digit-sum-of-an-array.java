class Solution {
    public int differenceOfSum(int[] nums) {
         int digit = 0;
        int sum = 0;
        for(int i =0;i<nums.length;i++)
        {
            sum = sum+nums[i];
            int num = nums[i];

                while(num>0){
                int rem = num%10;
                digit = digit+rem;
                num = num/10;
            }
        }
        return sum-digit;
        }
        
        
    }
     
