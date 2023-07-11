class Solution {
    public List<String> summaryRanges(int[] nums) {
         ArrayList <String> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int k = nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1])
            {
                i++;
            }
            if(k!=nums[i])
            {
                ans.add(""+k+"->"+nums[i]);
            }
            else
            {
                ans.add(""+k);
            }
        }
        return ans;
    }
}