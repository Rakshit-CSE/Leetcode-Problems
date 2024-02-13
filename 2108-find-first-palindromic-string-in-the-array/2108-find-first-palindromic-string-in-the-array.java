class Solution {
    public String firstPalindrome(String[] words) {
        int n = words.length;
        String ans="";
        for(int i=0;i<n;i++)
        {
            if(ispal(words[i]))
            {
                ans+=words[i];
                break;
            }
        }
        return ans;
    }
    public static boolean ispal(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}