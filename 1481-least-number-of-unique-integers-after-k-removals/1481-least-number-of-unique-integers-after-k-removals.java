class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        ArrayList<ds> ls = new ArrayList<>();
        for(int x: mp.keySet())
        {
            ds n = new ds(x,mp.get(x));
            ls.add(n);
        }
        Collections.sort(ls,(a,b)->{
            return a.freq-b.freq;
        });
        for(ds x:ls)
        {
            if(mp.get(x.val)==k)
            {
                k-=mp.get(x.val);
                mp.put(x.val,0);
            }
            else if(mp.get(x.val)<k)
            {
                k-=mp.get(x.val);
                mp.put(x.val,0);
            }
            else
            {
                break;
            }
        }
        int c=0;
        for(int x:mp.keySet())
        {
            if(mp.get(x)>0)
            {
                System.out.print(x+" ");
            }
        }
        for(int x:mp.keySet())
        {
            if(mp.get(x)>0)
            {
                c++;
            }
        }
        return c;
        
    }
    public class ds
    {
        int val;
        int freq;
        public ds(int val,int freq)
        {
            this.val = val;
            this.freq = freq;
        }
    }
}