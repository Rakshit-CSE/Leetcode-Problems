class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String subs = "";
        int n = s.length();

        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                subs = s.substring(0,i);
                if(s.replaceAll(subs,"").isEmpty())
                {
                    return true;
                }
            }
        }
        return false;
    }
}