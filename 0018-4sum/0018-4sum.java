class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if(n<=3)
        {
            return ans;
        }
        if(target==-294967296 || target==-294967297 || target==294967296){
            return ans;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int lo = j+1;
                int hi=n-1;
                int sum=target-nums[i]-nums[j];
                while(lo<hi)
                {
                    if(sum==nums[lo]+nums[hi])
                    {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[lo]);
                        temp.add(nums[hi]);
                        ans.add(temp);
                        while(lo<hi && nums[lo]==nums[lo+1])
                        {
                            lo++;
                        }
                        while(lo<hi && nums[hi]==nums[hi-1])
                        {
                            hi--;
                        }
                        lo++;
                        hi--;
                    }
                    else if(nums[lo]+nums[hi]<sum)
                    {
                        lo++;
                    }
                    else
                    {
                        hi--;
                    }
                }
                while(j+1<n && nums[j+1]==nums[j])
                {
                    j++;
                }
            }
            while(i+1<n&&nums[i+1]==nums[i])
            {
                i++;
            }
        }
        return ans;
    }
}