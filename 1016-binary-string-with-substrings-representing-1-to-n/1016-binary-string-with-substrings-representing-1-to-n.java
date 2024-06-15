class Solution {
    public boolean queryString(String s, int n) {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            String bin=Integer.toBinaryString(i);
            if (s.contains(bin))
            {
                c++;
            }
            else
            {
                return false;
            }
        }
        return c==n?true:false;
    }
}