class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length];
        ArrayList<Integer> y = new ArrayList<>();
        ArrayList<Integer> x = new ArrayList<>();
        int xi=0;
        int yi=0;
        for(int i=n;i<nums.length-1;i++)
        {
            y.add(nums[i]);
        }
        for(int i=1;i<n;i++)
        {
            x.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i==0||i==nums.length-1)
            {
                ans[i] = nums[i];
            }
            else if(i%2!=0)
            {
                ans[i] = y.get(yi);
                yi++;
            }
            else
            {
                ans[i] = x.get(xi);
                xi++;
            }
        }
        return ans;
    }
}