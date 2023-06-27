class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=-1;
        int j=-1;
        for(int k=0;k<nums.length;k++)
        {
            if(nums[k]==target)
            {
                i=k;
                break;
            }
        }
        for(int k=nums.length-1;k>=0;k--)
        {
            if(nums[k]==target)
            {
                j=k;
                break;
            }
        }
        int ans[] = new int[2];
        ans[0]=i;
        ans[1]=j;
        return ans;
        
    }
}