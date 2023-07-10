class Solution {
    public int arrangeCoins(int n) {
        int ans=0;
        int x=1;
        while((n-x)>=0)
        {
            ans++;
            n-=x;
            x++;
        }
        return ans;
    }
}