class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int len=0;
        String ans="";
        for(int i=0;i<n;i++)
        {
            String curr = fun(s,i,i);
            if(curr.length()>len)
            {
                ans=curr;
                len = curr.length();
            }
            curr = fun(s,i,i+1);
            if(curr.length()>len)
            {
                ans=curr;
                len = curr.length();
            }
        }
        return ans;
    }

    public static String fun(String s,int si,int ei)
    {
        int n = s.length();
        while(si>=0 && ei<n)
        {
            if(s.charAt(si)==s.charAt(ei))
            {
                si--;
                ei++;
            }
            else break;
        }
        return s.substring(si+1,ei);
    }
}