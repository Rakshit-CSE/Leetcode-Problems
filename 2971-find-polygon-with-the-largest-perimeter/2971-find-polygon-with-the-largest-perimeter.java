class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long s = 0;
        if(nums.length<3) return -1;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
        }
        for(int i=nums.length-1;i>1;i--)
        {
            s-=nums[i];
            if(s>nums[i])
            {
                return s+nums[i];
            }
        }
        return -1;
    }
}