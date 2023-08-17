class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        Map<Integer,Integer> mp = new HashMap<>();
        int ans = 0;
        for(int t:time)
        {
            int mod = t%60;
            int rem = (mod==0)? 0 : 60-mod;
            ans += mp.getOrDefault(rem, 0);
            mp.put(mod, 1+mp.getOrDefault(mod,0)); 
        }
        return ans;
    }
}

