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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        ans = fun(root,0,targetSum,new ArrayList<>(),ans);
        return ans;
    }

    public static List<List<Integer>> fun(TreeNode root, int sum, int targetSum, List<Integer> list, List<List<Integer>> ans)
    {
        if(root==null) return ans;
        list.add(root.val);
        if(root.left==null && root.right==null && sum+root.val==targetSum)
        {
            ans.add(new ArrayList<>(list));
        }
        fun(root.left,sum+root.val,targetSum,list,ans);
        fun(root.right,sum+root.val,targetSum,list,ans);
        list.remove(list.size()-1);
        return ans;
    }
}