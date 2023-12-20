class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int ans=Integer.MAX_VALUE;
        int x=Integer.MAX_VALUE;
        int y=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                int temp = money-prices[i]-prices[j];
                if(temp>=0 && x>prices[i] && y>prices[j])
                {
                    ans=Math.min(ans,temp);
                    x=prices[i];
                    y=prices[j];
                }
            }
        }
        if(ans!=Integer.MAX_VALUE) return ans;
        else return money;
        
    }
}