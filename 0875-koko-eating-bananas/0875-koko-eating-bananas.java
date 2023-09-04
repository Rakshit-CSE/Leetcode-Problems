class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long start = 1;
        long sum = 0;
        for(int i=0;i<piles.length;i++){
            sum+=piles[i];
        }
        long end = sum;
        long ans = -1;

        while(start<=end)
        {
            long mid = start+(end-start)/2;
            if(ispossible(mid,piles,h))
            {
                ans = mid;
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }

        }
        return (int)ans;
    }
    public static boolean ispossible(long mid,int[] piles,int h)
    {
        long num = mid;
        long hr=0;
        int i=0;
        while(i<piles.length)
        {
            if(piles[i]%num==0)
            {
                long temp = piles[i]/num;
                hr+=temp;
                i++;
            }
            else
            {
                long temp = piles[i]/num;
                hr+=temp+1;
                i++;
            }
        }
        if(hr<=h)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}