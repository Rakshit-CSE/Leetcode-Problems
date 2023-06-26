class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        Arrays.sort(nums);
        int freq[] = new int[100001];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(freq[nums[i]]>1 && nums[i+1]!=nums[i])
            {
                ans.add(nums[i]);
            }
        }
        if(freq[nums[nums.length-1]]>1)
        {
            ans.add(nums[nums.length-1]);
        }
        return ans;        
    }
}