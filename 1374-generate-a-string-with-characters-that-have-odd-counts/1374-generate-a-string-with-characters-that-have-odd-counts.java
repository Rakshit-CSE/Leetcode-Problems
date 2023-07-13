class Solution {
    public String generateTheString(int n) {
        String ans="";
        if(n%2==0)
        {
            ans+='a';
            for(int i=1;i<n;i++)
            {
                ans+='b';
            }
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                ans+='b';
            }
        }
        return ans;
    }
}