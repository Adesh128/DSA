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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inTraversalOrder(root,result);
        return(result);
    }
    
    private void inTraversalOrder(TreeNode node, List<Integer> result){
        if(node == null){
            return;
        }
        inTraversalOrder(node.left,result);
        result.add(node.val);
        inTraversalOrder(node.right,result);
    }
    }
