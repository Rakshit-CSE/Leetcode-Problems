class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,-1);
        return fun(nums,dp,0);
    }
    
    public static int fun(int[] nums, int[] dp, int i)
    {
        if(i>=nums.length)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        int rob = nums[i]+fun(nums,dp,i+2);
        int do_ntrob = fun(nums,dp,i+1);
        dp[i] = Math.max(rob,do_ntrob);
        return Math.max(rob,do_ntrob);
    }
}