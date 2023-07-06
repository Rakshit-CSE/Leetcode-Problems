class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ans=Integer.MIN_VALUE;
        int prev=1;
        for(int i=0;i<n;i++)
        {
            prev*=nums[i];
            ans = Math.max(ans,prev);
            if(prev==0)
            {
                prev=1;
            }
        }
        prev=1;
        for(int i=n-1;i>=0;i--)
        {
            prev*=nums[i];
            ans=Math.max(prev,ans);
            if(prev==0)
            {
                prev=1;
            }
        }
        return ans;         
    }
}