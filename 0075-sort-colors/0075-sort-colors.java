class Solution {
    public void sortColors(int[] nums) {
        int c1=0;
        int c2=0;
        int c3=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                c1++;
            }
            else if(nums[i]==1)
            {
                c2++;
            }
            else
            {
                c3++;
            }
        }
        int k=0;
        for(;k<c1;k++)
        {
            nums[k]=0;
        }
        for(;k<c1+c2;k++)
        {
            nums[k]=1;
        }
        for(;k<c1+c2+c3;k++)
        {
            nums[k]=2;
        }
    }
}