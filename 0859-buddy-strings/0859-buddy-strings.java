class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            int[] frequency = new int[26];
            for (char ch : s.toCharArray()) {
                frequency[ch - 'a']++;
                if (frequency[ch - 'a'] == 2) {
                    return true;
                }
            }
            return false;
        }
        int f = -1;
        int s1 = -1;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (f == -1) {
                    f = i;
                } 
                else if (s1 == -1) {
                    s1 = i;
                } 
                else {
                    return false;
                }
            }
        }
        if (s1 == -1) {
            return false;
        }
        boolean ans = s.charAt(f) == goal.charAt(s1) && s.charAt(s1) == goal.charAt(f);
        return ans;
    }
}