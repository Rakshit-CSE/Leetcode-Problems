class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int s=0;
        int c=0;
        int arr[] = new int[100001];
        for(int i=0;i<banned.length;i++)
        {
            arr[banned[i]]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(arr[i]==0 && s+i<=maxSum)
            {
                s+=i;
                c++;
            }
        }
        return c;        
    }
}