class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            temp.add(nums[i]);
        }
        Collections.sort(temp);
        if(temp.size()%3!=0)
        {
            while(temp.size()%3!=0)
            {
                temp.add(0);
            }
        }
        for(int i=0;i<temp.size()-2;i+=3)
        {
            if(!temp.get(i).equals(temp.get(i+2))){
                return temp.get(i);
            }
        }
        return 0;
    }
}


