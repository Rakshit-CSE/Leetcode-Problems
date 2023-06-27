class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                even.add(nums[i]);
            }
            else
            {
                odd.add(nums[i]);
            }
        }
        int idx1=0;
        int idx2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                nums[i]=even.get(idx1);
                idx1++;
            }
            else
            {
                nums[i]=odd.get(idx2);
                idx2++;
            }
        }
        return nums;
    }
}