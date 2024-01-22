class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=1;i<=nums.length;i++)
        {
            mp.put(i,0);
        }
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int ans[] = new int[2];
        for(int x:mp.keySet())
        {
            if(mp.get(x)==2)
            {
                ans[0]=x;
            }
            if(mp.get(x)==0)
            {
                ans[1]=x;
            }
        }
        return ans;
    }
}