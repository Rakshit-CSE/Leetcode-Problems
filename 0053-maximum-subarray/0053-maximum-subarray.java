class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int ans=Integer.MIN_VALUE;
        int prev_sum=0;
        for(int i=0;i<n;i++)
        {
            prev_sum+=nums[i];
            ans = Math.max(ans,prev_sum);
            if(prev_sum<0)
            {
                prev_sum=0;
            }
        }
        return ans;
        
    }
}