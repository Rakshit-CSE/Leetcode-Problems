class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ans = new ArrayList<>();
        int arr[][] = new int[3][101];
        for(int i:nums1)
        {
            arr[0][i] = 1;
        }
        for(int i:nums2)
        {
            arr[1][i] = 1;
        }
        for(int i:nums3)
        {
            arr[2][i] = 1;
        }
        for(int i=1;i<101;i++)
        {
            if(arr[0][i]+arr[1][i]+arr[2][i]>1)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}