class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums ==null || nums.length<3)
        return new ArrayList<>();

        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int Left = i+1;
            int Right = nums.length-1;
            while(Left<Right){
                int sum = nums[i]+nums[Left]+nums[Right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[Left],nums[Right]));
                    Left++;
                    Right--;
                }else if(sum<0){
                    Left++;
                }else{
                    Right--;
                }
            }
        }
        return new ArrayList<>(result);


        
    }
}