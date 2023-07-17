class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split("\\W+");
        String ans="";
        for(int i=0;i<k;i++)
        {
            if(i!=k-1)
            {
                ans+=words[i];
                ans+=" ";
            }
            else
            {
                ans+=words[i];
            } 
        }
        return ans;
    }
}