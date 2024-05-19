class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        int n = nums.length;
        int[] diff = new int[n];
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = (nums[i] ^ k) - nums[i];
            totalSum += nums[i];
        }

        Arrays.sort(diff);
        
        for (int i = n - 1; i > 0; i -= 2) {
            if ((diff[i] + diff[i - 1]) > 0) {
                totalSum += (diff[i] + diff[i - 1]);
            }
        }

        return totalSum;
    }
}