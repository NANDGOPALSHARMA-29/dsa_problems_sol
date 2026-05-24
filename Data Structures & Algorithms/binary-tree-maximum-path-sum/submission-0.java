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
    int max = Integer.MIN_VALUE;
    public int solve(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = solve(root.left);
        int right = solve(root.right);
        int path = root.val + left + right;
        int sum = Math.max(left,right) + root.val;
        int only = root.val;
        max = Math.max(Math.max(path,sum),Math.max(max,only));
        return Math.max(sum,only);
    }
    public int maxPathSum(TreeNode root) {
        solve(root);
        return max;

    }
}
