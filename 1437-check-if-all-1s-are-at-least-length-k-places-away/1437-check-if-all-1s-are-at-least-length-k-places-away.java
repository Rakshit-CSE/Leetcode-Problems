class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int currcount=k;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                currcount++;
            }
            else
            {
                if(currcount<k)
                {
                    return false;
                }
                currcount=0;
            }
        }
        return true;
        
    }
}