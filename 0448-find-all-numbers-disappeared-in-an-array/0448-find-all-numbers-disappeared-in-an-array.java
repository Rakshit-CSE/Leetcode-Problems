class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int freq[] = new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        for(int i=1;i<nums.length+1;i++)
        {
            if(freq[i]==0)
            {
                list.add(i);
            }
        }     
        return list;
    }
}