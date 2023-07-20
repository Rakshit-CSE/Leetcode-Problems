class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                int temp = mp.getOrDefault(nums1[i]+nums2[j],0);
                mp.put(nums1[i]+nums2[j],temp+1);
            }
        }
        
        int c=0;

        for(int i=0;i<nums3.length;i++)
        {
            for(int j=0;j<nums4.length;j++)
            {
                int temp = nums3[i]+nums4[j];
                if(mp.containsKey(-temp))
                {
                    c+=mp.get(-temp);
                }
            }
        }
        return c;
    }
}