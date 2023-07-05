class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        int x = n/2;
        int freq[] = new int[10001];
        for(int i=0;i<n;i++)
        {
            freq[nums[i]]++;
        }
        for(int i=0;i<n;i++)
        {
            if(freq[nums[i]]==x)
            {
                return nums[i];
            }
        }
        return -1;
    }
}