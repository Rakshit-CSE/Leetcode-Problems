class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<String,Integer> mp = new HashMap<>();
        for(String x:words)
        {
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        int ans=0;
        for(String x: mp.keySet())
        {
            int i=0;
            int j=0;
            while(i<s.length() && j<x.length())
            {
                if(s.charAt(i)==x.charAt(j))
                {
                    i++;
                    j++;
                }
                else
                {
                    i++;
                }
            }
            if(j==x.length())
            {
                ans+=mp.get(x);
            }
        }
        return ans;
    }
}