class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
         k = k%n;
        int [] arr = new int [n];
        // put last element to begning of array
        for(int i = n-k;i<n;i++){
            arr[i-(n-k)] = nums[i];
        }
        // put remaining array after that
        for(int i=0;i<n-k;i++){
            arr[i+k] = nums[i];
        }
        // copy all element to original array
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
        
    }
}