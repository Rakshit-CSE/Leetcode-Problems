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


// sort(nums.begin(), nums.end());
        
//         // If the size of the vector is not divisible by 3, add zeros until it is
//         if (nums.size() % 3 != 0) {
//             while (nums.size() % 3 != 0) {
//                 nums.push_back(0);
//             }
//         }
        
//         // Iterate over the vector in groups of three
//         for (int i = 0; i < nums.size() - 2; i = i + 3) {
//             // If the first and third elements of the group are not equal, return the first element
//             if (nums[i] != nums[i + 2]) {
//                 return nums[i];
//             }
//         }
        
//         // If no single number is found, return 0
//         return 0;