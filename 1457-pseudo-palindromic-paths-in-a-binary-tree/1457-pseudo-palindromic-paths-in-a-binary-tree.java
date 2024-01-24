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
    static int res;
    public int pseudoPalindromicPaths (TreeNode root) {
        int arr[] = new int[10];
        res=0;
        dfs(arr,root);
        return res;
    }
    public static void dfs(int[] arr,TreeNode root)
    {
        if(root==null) return;
        arr[root.val]++;
        if(root.left==null && root.right==null)
        {
            if(ispal(arr))
            {
                res++;
            }
        }
        else
        {
            dfs(arr,root.left);
            dfs(arr,root.right);
        }
        arr[root.val]--;
    }
    public static boolean ispal(int arr[])
    {
        int c=0;
        for(int i=1;i<10;i++)
        {
            if(arr[i]%2!=0) c++;
        }
        return (c==1 || c==0);
    }
}