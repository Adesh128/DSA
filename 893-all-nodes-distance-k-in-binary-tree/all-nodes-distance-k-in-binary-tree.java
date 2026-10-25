
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    List<Integer> ans = new ArrayList<>(); // empty array list created 

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        find(root, target, k);
        return ans;
    }

    public int find(TreeNode node, TreeNode target, int k) {

        if (node == null) {
            return -1;
        }

        if (node == target) {
            collect(node, k);
            return 1;
        }

        int left = find(node.left, target, k);

        if (left != -1) {

            if (left == k) {
                ans.add(node.val);
            } else {
                collect(node.right, k - left - 1);
            }

            return left + 1;
        }

        int right = find(node.right, target, k);

        if (right != -1) {

            if (right == k) {
                ans.add(node.val);
            } else {
                collect(node.left, k - right - 1);
            }

            return right + 1;
        }

        return -1;
    }

    public void collect(TreeNode node, int distance) {

        if (node == null || distance < 0) {
            return;
        }

        if (distance == 0) {
            ans.add(node.val);
            return;
        }

        collect(node.left, distance - 1);
        collect(node.right, distance - 1);
    }
}
