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
    public static boolean same(TreeNode p,TreeNode q)
    {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return (same(p.left,q.left) && same(p.right,q.right));
    }
    public static TreeNode invert(TreeNode root)
    {
        if(root==null) return root;
        TreeNode l = root.left;
        TreeNode r = root.right;
        root.left = invert(r);
        root.right = invert(l);
        return root;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        root.left = invert(root.left);
        return same(root.left,root.right);
    }
        
}