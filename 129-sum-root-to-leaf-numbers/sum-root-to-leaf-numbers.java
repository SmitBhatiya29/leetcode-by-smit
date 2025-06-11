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
    int sum = 0;
    public void travel(TreeNode root, int num)
    {
        if(root==null){
            return;
        }
         num = num * 10 + root.val;
         if (root.left == null && root.right == null) {
            sum += num;
            return;
        }
       
        travel(root.left,num);
        travel(root.right,num);
        return ;
    }
    public int sumNumbers(TreeNode root) {
        if(root == null){
            return 0;
        }
        travel(root,0);
        return sum;

    }
}