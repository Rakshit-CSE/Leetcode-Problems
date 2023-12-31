class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        int ans=-1;
        for(int i=0;i<s.length();i++)
        {
            if(mp.containsKey(s.charAt(i)))
            {
                ans=Math.max(ans,i-mp.get(s.charAt(i))-1);
            }
            else
            {
                mp.put(s.charAt(i),i);
            }
        }
        return ans;
    }
}