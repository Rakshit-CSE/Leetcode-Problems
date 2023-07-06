class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) nums[i]=-1;
        }

        Map<Integer, Integer> sumtoIndex = new HashMap<>();
        sumtoIndex.put(0,-1);
        int sum=0;
        int mx=0;

        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sumtoIndex.containsKey(sum))
            {
                mx = Math.max(mx,i-sumtoIndex.get(sum));
            }
            else
            {
                sumtoIndex.put(sum,i);
            }
        }
        return mx;
    }
}