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

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;

        Queue<Object[]> queue = new LinkedList<>();

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map
            = new TreeMap<>();

        queue.offer(new Object[]{root, 0, 0});

        while(!queue.isEmpty()) {

            Object[] curr = queue.poll();

            TreeNode node = (TreeNode) curr[0];
            int row = (int) curr[1];
            int col = (int) curr[2];

            map.putIfAbsent(col, new TreeMap<>());

            map.get(col).putIfAbsent(row, new PriorityQueue<>());

            map.get(col).get(row).offer(node.val);

            if(node.left != null) {
                queue.offer(new Object[]{node.left, row+1, col-1});
            }

            if(node.right != null) {
                queue.offer(new Object[]{node.right, row+1, col+1});
            }
        }

        for(int col : map.keySet()) {

            List<Integer> list = new ArrayList<>();

            for(int row : map.get(col).keySet()) {

                while(!map.get(col).get(row).isEmpty()) {
                    list.add(map.get(col).get(row).poll());
                }
            }

            ans.add(list);
        }

        return ans;
    }
}