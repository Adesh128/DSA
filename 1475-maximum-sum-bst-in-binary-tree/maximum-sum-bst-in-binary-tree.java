/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans =0;
    public int maxSumBST(TreeNode root) {
         
        helper(root);
        return ans;
    }

    public int[] helper(TreeNode node){
        
        if(node == null){
            return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE,0};
        }
        int left[] = helper(node.left);
        int right[] = helper(node.right);

        if(node.val>left[1] && node.val<right[0]){
            int currSum = left[2] +right[2]+node.val;

          ans = Math.max(ans,currSum);
            int minVal = Math.min(node.val,left[0]);
            int maxVal = Math.max(node.val,right[1]);
        
            return new int[]{minVal,maxVal,currSum};
        }
            int maxSum = Math.max(left[2],right[2]);
            return new int[] {Integer.MIN_VALUE,Integer.MAX_VALUE,maxSum};
        }
        
    
}