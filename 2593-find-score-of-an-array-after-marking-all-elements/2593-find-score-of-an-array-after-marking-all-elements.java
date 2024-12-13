class Pair {
    int value;
    int index;
    public Pair(int value, int index) {
        this.value = value;
        this.index = index;
    }
}

class Solution {
    public long findScore(int[] nums) {
        if (nums.length == 0) return 0; 
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.value != b.value) {
                return Integer.compare(a.value, b.value); // Compare by value first
            }
            return Integer.compare(a.index, b.index); // Compare by index if values are the same
        });
        int[] visit = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            pq.add(new Pair(nums[i], i));
        }
        long ans = 0;
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(visit[curr.index]==0){
                ans+=curr.value;
                if(curr.index>0) visit[curr.index-1]=1;
                if(curr.index<nums.length-1) visit[curr.index+1]=1;
            }
        }

        return ans;
    }
}