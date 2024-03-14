class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       int sum=0;
       int cnt=0;
       Map<Integer,Integer> mp = new HashMap<>();
       mp.put(0,1);
       for(int i=0;i<nums.length;i++)
       {
        sum+=nums[i];
        cnt+=mp.getOrDefault(sum-goal,0);
        mp.put(sum,mp.getOrDefault(sum,0)+1);
       } 
       return cnt;
    }
}