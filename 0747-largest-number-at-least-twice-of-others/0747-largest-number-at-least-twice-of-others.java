class Solution {
    public int dominantIndex(int[] nums) {
        int ans=nums[0];
        int flag=1;
        for(int i=1;i<nums.length;i++)
        {
            ans = Math.max(ans,nums[i]);
        }
        int index=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==ans)
            {
                index = i;
                break;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i!=index)
            {
                if(nums[i]>ans/2)
                {
                    flag=0;
                    break;
                }
            }
        }
        if(flag==0)
        {
            return -1;
        }
        else
        {
            return index;
        }
    }
}