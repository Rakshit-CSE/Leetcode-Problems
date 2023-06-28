class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int c=n/2;
        int ans=0;
        for(int i=0;i<nums.length;i+=2)
        {
            ans+=nums[i];
        }
        return ans;
    }
}