class Solution {
    public long continuousSubarrays(int[] nums) {
        long cnt=0;
        
        int ws = 0;
        
        int we = 0;
        
        PriorityQueue<Integer> mh = new PriorityQueue<>();
        
        PriorityQueue<Integer> mx = new PriorityQueue<>((a,b)->b-a);
        
        while(we<nums.length)
        {
            
            mx.offer(nums[we]);
            
            mh.offer(nums[we]);
            
            while(mx.peek()-mh.peek()>2)
            {
                
                mx.remove(nums[ws]);
                
                mh.remove(nums[ws]);
                
                ws++;
                
            }
            
            cnt+=we*1L - ws*1L + 1L;
            
            we++;
        }
        
        return cnt;
        
    }
}