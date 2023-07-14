class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            int s = candies[i]+extraCandies;
            int flag=0;
            for(int j=0;j<candies.length;j++)   
            {
                if(candies[j]>s)
                {
                    flag=1;
                }
            }
            if(flag==1)
            {
                ans.add(false);
            }
            else
            {
                ans.add(true);
            }
        }
        return ans;
    }
}