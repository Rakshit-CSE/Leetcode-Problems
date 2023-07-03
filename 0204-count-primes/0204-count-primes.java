class Solution {
    public int countPrimes(int n) {
       boolean prime[] = new boolean[n];
        if(n==0 || n==1) return 0;
        prime[0]=true;
        prime[1]=true;

        for(int i=2;i*i<n;i++)
        {
            if(prime[i]==false)
            {
                for(int mul=2;mul*i<n;mul++)
                {
                    prime[mul*i]=true;
                }
            }
        }
        int c=0;
        for(int i=0;i<prime.length;i++)
        {
            if(prime[i]==false)
            {
                c++;
            }
        }
        return c;
    }
}