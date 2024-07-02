class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num: nums1)
        {
            if(mp.containsKey(num))
            {
                mp.put(num,mp.get(num)+1);
            }
            else
            {
                mp.put(num,1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int n: nums2)
        {
            if(mp.containsKey(n) && mp.get(n)>0)
            {
                ans.add(n);
                mp.put(n,mp.get(n)-1);
            }
        }
        int res[] = new int[ans.size()];
        int i=0;
        for(int x: ans)
        {
            res[i++] = x;
        }
        return res;
    }
}