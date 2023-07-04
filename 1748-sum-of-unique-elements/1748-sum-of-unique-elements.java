class Solution {
    public int sumOfUnique(int[] nums) {
         int freq[] = new int[101];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        int s=0;
        for(int i=0;i<101;i++)
        {
            if(freq[i]==1)
            {
                s+=i;
            }
        }
        return s;
    }
}