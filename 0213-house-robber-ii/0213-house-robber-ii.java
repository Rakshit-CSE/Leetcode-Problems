class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        int dp1[] = new int[nums.length];
        int dp2[] = new int[nums.length];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max(fun(nums,dp1,0,nums.length-2),fun(nums,dp2,1,nums.length-1));
    }
    
    public static int fun(int nums[], int dp[],int i,int j)
    {
        if(i>j)
        {
            return 0;
        }
        
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        
        int rob = nums[i] + fun(nums,dp,i+2,j);
        int do_ntrob = fun(nums,dp,i+1,j);
        return dp[i] = Math.max(rob,do_ntrob);
    }
}