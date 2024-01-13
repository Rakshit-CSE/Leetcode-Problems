class Solution {
    public int minSteps(String s, String t) {
        char s1[] = s.toCharArray();
        char s2[] = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        int cnt=0;
        int top=0;
        int bottom=0;
        while(top<s.length() && bottom<t.length())
        {
            if(s1[top]==s2[bottom])
            {
                cnt++;
                top++;
                bottom++;
            }
            else if(s1[top]<s2[bottom]) top++;
            else if(s1[top]>s2[bottom]) bottom++;
        }
        return s.length()-cnt;
    }
}