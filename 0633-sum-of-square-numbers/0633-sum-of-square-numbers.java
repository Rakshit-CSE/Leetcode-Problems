class Solution {
    public boolean judgeSquareSum(int c) {
        int i=0;
        int j=(int)Math.sqrt(c);
        while(i<=j)
        {
            long ans=(long)i*i+(long)j*j;
            if(ans==c)
            {
                return true;
            }
            if(ans>c)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return false;
    }
}