class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> set = new HashSet<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                i++;
            }
            else if(nums1[i]>nums2[j])
            {
                j++;
            }
            else
            {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int ans[] = new int[set.size()];
        int z=0;
        for(Integer x:set)
        {
            ans[z++]=x;
        }
        return ans;     
    }
}