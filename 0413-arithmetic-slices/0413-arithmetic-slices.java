class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if(n<=2) return 0;
        int curr=0;
        int ans=0;
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2])
            {
                curr+=1;
                ans+=curr;
            }
            else
            {
                curr=0;
            }
        }  
        return ans;
    }
}