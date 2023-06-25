class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int flag=0;
        int count=1;
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]==nums[i-1])
            {
                flag = flag+1;
            }
            else
            {
                count = count+1;
            }
            if(count==3)
            {
                return nums[nums.length-count-flag];
            }
        }
        return nums[nums.length-1];        
    }
}