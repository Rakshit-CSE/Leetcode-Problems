class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x:nums)
        {
            pq.add(x);
        }
        long ans=0;
        while(k-->0)
        {
            int temp = pq.poll();
            ans+= (long)temp;
            pq.add((int)Math.ceil((double)temp/3));
        }
        return ans;
    }
}