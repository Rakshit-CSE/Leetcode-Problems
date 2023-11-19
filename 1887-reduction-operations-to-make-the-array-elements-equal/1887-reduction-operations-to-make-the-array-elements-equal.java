class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum=0;
        int temp=0;

        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                temp++;
            }
            sum+=temp;
        }
        return sum;
    }
}