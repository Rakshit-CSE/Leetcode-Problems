class Solution {
    public String countAndSay(int n) {
        String res[] = new String[n];
        res[0] = "1";
        for(int i=1;i<n;i++)
        {
            res[i] = fun(res[i-1].toCharArray());
        }   
        return res[n-1];
    }
    private String fun(char[] s)
    {
        int cnt=1;
        char c = s[0];
        String ans = "";
        for(int i=1;i<s.length;i++)
        {
            if(s[i]==c)
            {
                cnt++;
            }
            else
            {
                ans+= cnt;
                ans+= c;
                c=s[i];
                cnt=1;
            }
        }
        ans+=cnt;
        ans+=c;
        return ans;
        
    }
}