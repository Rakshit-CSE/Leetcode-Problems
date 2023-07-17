class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int a = nums[0]*nums[1];
        int b = nums[len-1]*nums[len-2];
        return b-a;
    }
}