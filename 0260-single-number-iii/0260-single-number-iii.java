class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i]))
            {
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else
            {
                mp.put(nums[i],1);
            }
        }
        
        int idx=0;
        
        for(var x:mp.keySet())
        {
            if(mp.get(x)==1)
            {
                ans[idx++]=x;
            }
        }
        return ans;
    }
}