class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int n = s.length();
        HashSet<Integer> st = new HashSet<>(); 

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        int ans = 0; 

        for (int freq : mp.values()) {
            int temp = freq; 
      
            while (temp > 0 && st.contains(temp)) {
                ans++; 
                temp--; 
            }

            st.add(temp);
        }

        return ans;
    }
}