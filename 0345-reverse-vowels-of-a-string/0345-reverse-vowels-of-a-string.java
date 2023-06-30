class Solution {
    public String reverseVowels(String s) {
        char s1[] = s.toCharArray();
        int l=0;
        int r=s1.length-1;
        while(l<=r)
        {
            if ((s1[l] == 'a' || s1[l] == 'e' || s1[l] == 'i' || s1[l] == 'o' || s1[l] == 'u' || s1[l] == 'A' || s1[l] == 'E' || s1[l] == 'I' || s1[l] == 'O' || s1[l] == 'U') && (s1[r] == 'a' || s1[r] == 'e' || s1[r] == 'i' || s1[r] == 'o' || s1[r] == 'u' || s1[r] == 'A' || s1[r] == 'E' || s1[r] == 'I' || s1[r] == 'O' || s1[r] == 'U'))
            {
                char temp = s1[l];
                s1[l] = s1[r];
                s1[r] = temp;
                l++;
                r--;
            }
            else if ((s1[l] != 'a' && s1[l] != 'e' && s1[l] != 'i' && s1[l] != 'o' && s1[l] != 'u' && s1[l] != 'A' && s1[l] != 'E' && s1[l] != 'I' && s1[l]                 != 'O' && s1[l] != 'U') && (s1[r] == 'a' || s1[r] == 'e' || s1[r] == 'i' || s1[r] == 'o' || s1[r] == 'u' || s1[r] == 'A' || s1[r] == 'E' ||             s1[r] == 'I' || s1[r] == 'O' || s1[r] == 'U'))
            {
                l++;
            }
            else if ((s1[l] == 'a' || s1[l] == 'e' || s1[l] == 'i' || s1[l] == 'o' || s1[l] == 'u' || s1[l] == 'A' || s1[l] == 'E' || s1[l] == 'I' || s1[l]             == 'O' || s1[l] == 'U') && (s1[r] != 'a' && s1[r] != 'e' && s1[r] != 'i' && s1[r] != 'o' && s1[r] != 'u' && s1[r] != 'A' && s1[r] != 'E' &&                 s1[r] != 'I' && s1[r] != 'O' && s1[r] != 'U'))
            {
                r--;
            }
            else{
                l++;
                r--;
            }
        }
        String ans="";
        for(int k=0;k<s1.length;k++)
        {
            ans+=s1[k];
        }
        return ans;
    }
}

        
