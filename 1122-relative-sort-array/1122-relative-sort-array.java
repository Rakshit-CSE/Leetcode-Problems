class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int freq[] = new int[1001];
        for(int i=0;i<arr1.length;i++)
        {
            freq[arr1[i]]++;
        }
        int ans[] = new int[arr1.length];
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<arr2.length;i++)
        {
            while(freq[arr2[i]]>0)
            {
                res.add(arr2[i]);
                freq[arr2[i]]--;
            }
        }
        for(int i=0;i<1001;i++)
        {
            while(freq[i]>0)
            {
                res.add(i);
                freq[i]--;
            }
        }
        for(int i=0;i<res.size();i++)
        {
            ans[i]=res.get(i);
        }
        return ans;
    }
}