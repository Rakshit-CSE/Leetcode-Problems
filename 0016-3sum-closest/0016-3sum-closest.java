class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                int diff = Math.abs(sum-target);
                if(diff==0) return sum;
                if(diff<min)
                {
                    min = diff;
                    ans = sum;
                }
                if(sum<target)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        return ans;
    }
}