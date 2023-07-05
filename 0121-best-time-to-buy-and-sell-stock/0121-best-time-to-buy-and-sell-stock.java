class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        int arr[] = new int[prices.length];
        arr[prices.length-1] = prices[prices.length-1];
        for(int i=prices.length-2;i>=0;i--)
        {
            arr[i] = Math.max(prices[i],arr[i+1]);
        }
        for(int i=0;i<prices.length;i++)
        {
            max = Math.max(max,arr[i]-prices[i]);
        }
        if(max<0) return 0;
        return max;
    }
}