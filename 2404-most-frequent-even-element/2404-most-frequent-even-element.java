class Solution {
    public int mostFrequentEven(int[] nums) {
        int freq[] = new int[100000];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        int max=Integer.MIN_VALUE;
        int maxf =Integer.MIN_VALUE;
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>maxf && i%2==0 && freq[i]!=0)
            {
                if(freq[i]==maxf)
                {
                    max = Math.min(i,max);
                }
                else
                {
                    max=i;
                }
                maxf=freq[i];
            }
        } 
        return max==Integer.MIN_VALUE?-1:max;             
    }
}