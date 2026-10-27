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
    ArrayList <Integer> leftIndex = new ArrayList<>();
    int maxWidth = 0;
    
    public int widthOfBinaryTree(TreeNode root) {
        
        findWidth(root,0,0);

        return maxWidth;


    }
// i = index at each node 
    public void findWidth(TreeNode node,int depth, int i){
        if(node == null){
            return;
        }
        if(depth == leftIndex.size()){
            leftIndex.add(i);

        }

        int width = i -leftIndex.get(depth) +1;

        maxWidth = Math.max(maxWidth,width);

        findWidth(node.left,depth+1,2*i);
         findWidth(node.right,depth+1,2*i+1);

    }
}