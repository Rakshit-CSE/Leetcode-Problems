class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int ans[] = new int[nums.length];
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
        }
        int n = nums.length;
        int bef=0;
        for(int i=0;i<n;i++)
        {
            int num=nums[i];
            sum=sum-num;
            int n_b= i;
            int n_a=n-i-1;
            int val=sum-n_a*num;
            val+=n_b*num-bef;
            bef+=nums[i];
            ans[i]= val;
        }
        return ans;
    }
}