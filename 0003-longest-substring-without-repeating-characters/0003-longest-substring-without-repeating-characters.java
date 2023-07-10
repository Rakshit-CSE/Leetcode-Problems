class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int mx = 0;
        HashSet<Character> st = new HashSet<>();
        int left = 0;

        for(int right=0;right<n;right++)
        {
            if(!st.contains(s.charAt(right)))
            {
                st.add(s.charAt(right));
                mx = Math.max(mx,right-left+1);
            }
            else
            {
                while(st.contains(s.charAt(right)))
                {
                    st.remove(s.charAt(left));
                    left++;
                }
                st.add(s.charAt(right));
            }
        }
        return mx;
    }
}