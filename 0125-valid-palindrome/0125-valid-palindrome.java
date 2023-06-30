class Solution {
    public boolean isPalindrome(String s) {
         String ans = "";
        String ans2 = "";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                ans += Character.toLowerCase(s.charAt(i));
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                ans += s.charAt(i);
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                ans += s.charAt(i);
            }
        }
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                ans2 += Character.toLowerCase(s.charAt(i));
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                ans2 += s.charAt(i);
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                ans2 += s.charAt(i);
            }
        }
        if(ans.equals(ans2))
        {
            return true;
        }
        else
        {
            return false;
        }        
    }
}