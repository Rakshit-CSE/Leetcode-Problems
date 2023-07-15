class Solution {
    public int largestAltitude(int[] gain) {
        int temp=0;
        int ans=0;
        for(int i=0;i<gain.length;i++)
        {
            temp+=gain[i];
            ans = Math.max(temp,ans);
        }
        return ans;
    }
}