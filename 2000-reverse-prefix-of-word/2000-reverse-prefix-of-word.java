class Solution {
    public String reversePrefix(String word, char ch) {
        int idx=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                idx=i;
                break;
            }
        }
        String s="";
        for(int i=idx;i>=0;i--)
        {
            s+=word.charAt(i);
        }
        s+=word.substring(idx+1);
        return s;
    }
}