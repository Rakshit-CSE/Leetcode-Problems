class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int freq[] = new int[k];
        int arr[] = new int[n+1];
        freq[0]=0;
        int sum=0;
        arr[0]=0;
        for(int i=1;i<n+1;i++)
        {
            arr[i]=nums[i-1]+arr[i-1];
        }
        for(int i=0;i<n+1;i++)
        {
            sum=arr[i];
            sum = sum%k;
            if(sum<0)
            {
                sum+=k;
            }
            freq[sum] = freq[sum]+1;
        }
        int ans=0;
        for(int i=0;i<k;i++)
        {
            if(freq[i]>=2)
            {
                ans += (freq[i]*(freq[i]-1))/2;
            }
        }
        return ans;
        
    }
}