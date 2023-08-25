class Solution {
    public int arrayNesting(int[] nums) {
        boolean freq[] = new boolean[nums.length];
        int ans = 0;

        for(int i=0;i<nums.length;i++)
        {
            int count = 0;
            int k=i;
            while(true)
            {
                if(freq[k]!=true)
                {
                    freq[k]=true;
                    count++;
                    k = nums[k];
                }
                else
                {
                    ans = Math.max(ans,count);
                    break;
                }
            }
        }
        return ans;
    }
}