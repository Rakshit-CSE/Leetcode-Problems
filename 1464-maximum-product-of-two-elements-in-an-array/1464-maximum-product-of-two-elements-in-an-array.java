class Solution {
    public int maxProduct(int[] nums) {
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                mx = Math.max(mx,(nums[i]-1)*(nums[j]-1));
            }
        }
        return mx; 
    }
}