class Solution {
    public int ans;

    public int distributeCoins(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftsideCoin = dfs(root.left);
        int rightsideCoin = dfs(root.right);

        ans += Math.abs(leftsideCoin) + Math.abs(rightsideCoin);

        return (root.val - 1) + leftsideCoin + rightsideCoin;
    }
}