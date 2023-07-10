class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        String ans="";
        for(int i=0;i<arr.length;i++)
        {
            if(i!=arr.length-1)
            {
                ans += rev(arr[i])+" ";
            }
            else
            {
                ans += rev(arr[i]); 
            }
        }
        return ans;    
    }
    public String rev(String st)
    {
        String ans="";
        for(int i=st.length()-1;i>=0;i--)
        {
            ans+=st.charAt(i);
        }
        return ans;
    }
}