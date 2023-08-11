class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        
        for(int x: arr)
        {
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        
        int freq[] = new int[mp.values().size()];
        
        int i=0;
        for(int x: mp.values())
        {
            freq[i++] = x;
        }
        
        Arrays.sort(freq);
        
        int ans=0;
        int removed = 0;
        int half = arr.length/2;
        
        i=freq.length-1;
        
        while(removed<half)
        {
            ans+=1;
            removed+=freq[i--];
        }
        return ans;
    }
}