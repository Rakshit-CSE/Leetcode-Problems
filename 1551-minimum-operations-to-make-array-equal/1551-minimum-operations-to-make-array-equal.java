class Solution {
    public int minOperations(int n) {
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = (2*i)+1;
        }
        int idx=0;
        int ans=0;
        while(idx<n/2)
        {
            ans+=Math.abs(arr[idx]-n);
            idx++;
        }
        return ans;

    }
    
}