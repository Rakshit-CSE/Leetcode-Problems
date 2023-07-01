class Solution {
    static int ans;
    static int count[];
    public int distributeCookies(int[] cookies, int k) {
        ans = Integer.MAX_VALUE;
        count = new int[k];

        fun(0,cookies,k);
        return ans;
    }

    public static void fun(int cookieNumber,int cookies[], int k)
    {
        if(cookieNumber==cookies.length)
        {
            int max=0;
            for(int i=0;i<k;i++)
            {
                max = Math.max(max,count[i]);
            }
            ans=Math.min(ans,max);
            return;
        }
        
        for(int i=0;i<k;i++)
        {
            count[i]+=cookies[cookieNumber];
            fun(cookieNumber+1,cookies,k);
            count[i]-=cookies[cookieNumber];
            if(count[i]==0)break;
        }
    }
}