class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        int i=0;
        int j=nums.length-1;
        ArrayList<Float> ans = new ArrayList<>();
        while(i<j)
        {
            double s=0;
            double avg = 0;
            avg = (nums[i]+nums[j])/2.0;
            ans.add((float)avg);
            i++;
            j--;
        }
        Collections.sort(ans);
        c=0;
        for(int k=1;k<ans.size();k++)
        {
            if((float)ans.get(k)!=(float)ans.get(k-1))
            {
                
                c++;
            }
        }
        
        {
            System.out.print(ans);
            return c+1;
        }        
    }
}