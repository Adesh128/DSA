class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> ans = new ArrayList<>();
        helper(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    static void helper(int index, int[] arr, int target, List<Integer> temp, List<List<Integer>> ans) {
        
        
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (index == arr.length || target < 0) {
            return;
        }

        
        temp.add(arr[index]);
        helper(index, arr, target - arr[index], temp, ans); //passed
        temp.remove(temp.size() - 1);

        // not passed
        helper(index + 1, arr, target, temp, ans);
    }  
    }
