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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> ls1 = new ArrayList<>();
        ArrayList<Integer> ls2 = new ArrayList<>();
        fun(root1,ls1);
        fun(root2,ls2);
        if(ls1.size()!=ls2.size())
        {
            return false;
        }
        for(int i=0;i<ls1.size();i++)
        {
            if(ls1.get(i)!=ls2.get(i))
            {
                return false;
            }
        }
        return true;
    }
    public static void fun(TreeNode root,ArrayList<Integer> ls)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            ls.add(root.val);
            return;
        }
        fun(root.left,ls);
        fun(root.right,ls);
    }
}