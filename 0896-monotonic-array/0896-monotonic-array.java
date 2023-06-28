class Solution {
    public boolean isMonotonic(int[] nums) {
        return inc(nums) || dec(nums);
    }
    public boolean inc(int nums[])
    {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public boolean dec(int nums[])
    {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                return false;
            }
        }
        return true;
    }
}