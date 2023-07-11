class Solution {
    public int findMin(int[] nums) {
        int lo=0;
        int hi = nums.length-1;

        while(lo<hi)
        {
            int mid = lo+(hi-lo)/2;
            if(nums[mid]>nums[hi])
            {
                lo=mid+1;
            }
            else if(nums[mid]<nums[hi])
            {
                hi=mid;
            }
            else if(nums[hi]==nums[hi-1])
            {
                hi--;
            }
            else
            {
                lo++;
            }
        }
        return nums[lo];
    }
}