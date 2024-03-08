class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int mx=0;
        for(int x:mp.keySet())
        {
            mx = Math.max(mx,mp.get(x));
        }
        int c=0;
        for(int x:mp.keySet())
        {
            if(mp.get(x)==mx)
            {
                c+=mp.get(x);
            }
        }
        return c;
    }
}