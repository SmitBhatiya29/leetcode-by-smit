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
    int ans = 0;
    public int travel(TreeNode root){
        if(root==null){
            return 0;
        }
        ans = ans + 1;
        travel(root.left);
        travel(root.right);
        return  ans;
        
    }
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        travel(root);
        return ans;
    }
}