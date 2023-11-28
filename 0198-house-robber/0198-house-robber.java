class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        return fun(nums);
    }
    
    public static int fun(int[] nums)
    {
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            int rob = nums[i] + dp[i-2];
            int do_ntrob = dp[i-1];
            dp[i]=Math.max(rob,do_ntrob);
        }
        return dp[nums.length-1];
        
    }
    
}