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
    
    public int answer = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return answer;
        dfs(root);
        return answer;
    }
    
    public int dfs(TreeNode root){
        if(root == null) return 0;
        int right = dfs(root.right);
        int left = dfs(root.left);
        answer = Math.max(answer, right + left);
        return Math.max(right, left) +1;
    }
}