class Solution {
    public int minFallingPathSum(int[][] grid) {
        int dp[][] = new int[grid.length][grid.length];
        for(int arr[]: dp)
        {
            Arrays.fill(arr,Integer.MAX_VALUE);
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++)
        {
            ans = Math.min(ans,fun(grid,dp,0,i));
        }
        return ans;
    }
    public static int fun(int[][] arr,int dp[][],int i,int j)
    {
        if(j<0 || j>=arr[0].length)
        {
            return Integer.MAX_VALUE;
        }
        if(i==arr.length-1)
        {
            return arr[i][j];
        }
        if(dp[i][j]!=Integer.MAX_VALUE)
        {
            return dp[i][j];
        }
        int cost = Integer.MAX_VALUE;
        for(int x=0;x<arr[0].length;x++)
        {
            if(x!=j)
            {
                cost = Math.min(cost,fun(arr,dp,i+1,x));
            }
        }
        return dp[i][j] = arr[i][j]+cost;
    }
}