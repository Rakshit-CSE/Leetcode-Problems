class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i]))
            {
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else
            {
                mp.put(nums[i],1);
            }
        }
        int arr[] = new int[mp.size()];
        int idx=0;
        for(var x: mp.entrySet())
        {
            arr[idx] = x.getValue();
            idx++;
        }
        Arrays.sort(arr);
        int res[] = new int[k];
        idx=0;
        int j = arr.length-1;
        while(idx<k)
        {
            for(var x: mp.entrySet())
            {
                if(x.getValue()==arr[j])
                {
                    res[idx] = x.getKey();
                    mp.remove(x.getKey());
                    break;
                }
            }
            j--;
            idx++;
        }
        return res;
    }
}