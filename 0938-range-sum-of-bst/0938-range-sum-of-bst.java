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
    public int rangeSumBST(TreeNode root, int low, int high) {
        fun(root,low,high);
        // System.out.println(ans);
        return ans;
    }
    public void fun(TreeNode root, int low, int high)
    {
        if(root==null)
        {
            return;
        }
        if(root.val>=low && high>=root.val)
        {
            ans+=root.val;
        }
        fun(root.left,low,high);
        fun(root.right,low,high);
    }
}