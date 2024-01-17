class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        if(k==0)
        {
            for(int i=0;i<nums1.length;i++)
            {
                if(nums1[i]!=nums2[i])
                {
                    return -1;
                }
            }
            return 0;
        }
        long pos=0;
        long neg=0;
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]==nums2[i])
            {
                continue;
            }
            else if(nums1[i]>nums2[i])
            {
                if((nums1[i]-nums2[i])%k==0)
                    pos+=nums1[i]-nums2[i];
                else
                    return -1;
            }
            else
            {
                if((nums1[i]-nums2[i])%k==0)
                    neg+=nums1[i]-nums2[i];
                else
                    return -1;
            }
        }
        if(pos==(neg*-1))
        {
            return pos/k;
        }
        else
        {
            return -1;
        }
    }
}