class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int si = 0;
        int ei= 0;
        int ans = 0;
        int pr = 1;
        
        while(ei<nums.length)
        {
            pr*=nums[ei];
            while(pr>=k && si<=ei)
            {
                pr/=nums[si];
                si++;
            }
            ans += ei-si+1;
            ei++;
        }
        return ans;
    }
}



