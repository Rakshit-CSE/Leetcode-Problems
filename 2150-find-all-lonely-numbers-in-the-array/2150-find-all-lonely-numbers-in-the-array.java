class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        List<Integer> ans = new ArrayList<>();

        for(int x:nums)
        {
            if(mp.get(x)==1)
            {
                if(!mp.containsKey(x+1) && !mp.containsKey(x-1))
                {
                    ans.add(x);
                }
            }
        }
        return ans;
    }
}