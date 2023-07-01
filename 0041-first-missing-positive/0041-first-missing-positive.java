class Solution {
    public int firstMissingPositive(int[] nums) {
        int k=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                continue;
            }
            else if(nums[i]==0)
            {
                continue;
            }
            else if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            else if(nums[i]==k)
            {
                k++;
            }
            else
            {
                break;
            }
        }
        return k;
    }
}

