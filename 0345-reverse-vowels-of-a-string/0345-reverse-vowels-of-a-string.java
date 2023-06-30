class Solution {
    public String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<=j)
        {
            if(fun(ch[i])==true && fun(ch[j])==true)
            {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            else if(fun(ch[i])!=true)
            {
                i++;
            }
            else if(fun(ch[j])!=true)
            {
                j--;
            } 
        }
        String ans = "";
        for(int k=0;k<ch.length;k++)
        {
            ans+=ch[k];
        }
        return ans;
    }
    public boolean fun(char c)
    {
        char arr[] = {'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<arr.length;i++)
        {
            if(c==arr[i])
            {
                return true;
            }
        }
        return false;
    }
}

        
