class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int x=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=x)
            {
                return x;
            }
            x++;
        }
        return x;
        
    }
}