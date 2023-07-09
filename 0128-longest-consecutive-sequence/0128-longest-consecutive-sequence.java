class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(int x: nums)
        {
            st.add(x);
        }

        int mx=0;

        for(int x: st)
        {
            if(!st.contains(x-1))
            {
                int currNum = x;
                int currStreak=1;
                while(st.contains(currNum+1))
                {
                    currStreak++;
                    currNum++;
                }
                mx = Math.max(mx,currStreak);
            }
        }
        return mx;
    }
}