class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        
        char arr[] = pattern.toCharArray();
        for(String s:queries)
        {
            boolean temp = fun(s.toCharArray(),arr);
            ans.add(temp);
        }
        return ans;
    }
    
    public static boolean fun(char s[],char arr[])
    {
        int j=0;
        for(int i=0;i<s.length;i++)
        {
            if(j<arr.length && s[i]==arr[j])
            {
                j++;
            }
            else if(s[i]>='A' && s[i]<='Z')
            {
                return false;
            }
        }
        return j==arr.length;
    }
}