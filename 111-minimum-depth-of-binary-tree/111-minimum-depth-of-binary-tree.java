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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        LinkedList<TreeNode> q = new LinkedList<>();
        int depth = 1;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i =0; i<size; i++){
                TreeNode node = q.poll();
                if(node.right == null && node.left == null) return depth;
                if(node.right != null){
                    q.offer(node.right);
                }
                if(node.left != null){
                    q.offer(node.left);
                }
            }
            depth++;
        }
        return depth;

    }
}