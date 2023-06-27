class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int j = nums.length-1;
        int i = 0;
        int ans=0;
        while(i<j)
        {
            ans+=nums[j--]-nums[i++];
        }
        return ans; 

    }
}