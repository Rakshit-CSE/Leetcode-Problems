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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> temp = levelOrder(root);
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<temp.size();i++)
        {
            List<Integer> arr = temp.get(i);
            ans.add(arr.get(arr.size()-1));
        }
        return ans;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int level = height(root)+1;
        for(int i=1;i<=level;i++)
        {
            List<Integer> temp = new ArrayList<>();
            fun(root,i,temp);
            ans.add(temp);
        }
        return ans;
    }
    
    public static int height(TreeNode root)
    {
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    
    public static void fun(TreeNode node,int n,List<Integer> temp)
    {
        if(node==null) return;
        if(n==1)
        { 
            temp.add(node.val); 
            return;
        }
        fun(node.left,n-1,temp);
        fun(node.right,n-1,temp);
    }
}