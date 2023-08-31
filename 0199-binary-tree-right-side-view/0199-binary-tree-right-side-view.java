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
    static int max_depth;
    public List<Integer> rightSideView(TreeNode root) {
        max_depth = -1;
        List<Integer> ans = new ArrayList<>();
        View(root,ans,0);
        return ans;
    }

    public static void View(TreeNode root, List<Integer> ans, int curr_level)
    {
        if(root==null)
        {
            return;
        }
        if(curr_level>max_depth)
        {
            ans.add(root.val);
            max_depth = curr_level;
        }
        View(root.right,ans,curr_level+1);
        View(root.left,ans,curr_level+1);
    }
}