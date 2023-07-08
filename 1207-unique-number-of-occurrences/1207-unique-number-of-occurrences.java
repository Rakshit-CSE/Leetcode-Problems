class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }
        HashMap<Integer,Integer> mp2 = new HashMap<>();
        for(var e: mp.values())
        {
            if(mp2.containsKey(e))
            {
                return false;
            }
            else
            {
                mp2.put(e,1);
            }
        }
        return true;
    }
}