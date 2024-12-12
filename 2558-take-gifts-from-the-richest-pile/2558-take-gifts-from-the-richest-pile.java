class Solution {
    public long pickGifts(int[] gifts, int k) {
        ArrayList<Integer> temp = new ArrayList<>();
        Arrays.sort(gifts);
        for(int i=0;i<gifts.length;i++)
        {
            temp.add(gifts[i]);
        }
        while(k-->0)
        {
            int t = (int)Math.sqrt(temp.get(temp.size()-1));
            temp.remove(temp.size()-1);
            temp.add(t);
            Collections.sort(temp);
        }
        long ans=0;
        for(int i=0;i<temp.size();i++)
        {
            ans+=temp.get(i);
        }
        return ans;
        
    }
}