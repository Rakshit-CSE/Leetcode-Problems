class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=left;i<=right;i++)
        {
            if(fun(i)==true)
            {
                ans.add(i);
            }
        }
        return ans;
    }

    public static boolean fun(int n)
    {
        if(n<=0) return false;
        int temp=n;
        while(temp>0)
        {
            int dig=temp%10;
            if(dig==0)
            {
                return false;
            }
            if(n%dig!=0)
            {
                return false;
            }
            temp/=10;
        }
        return true;
    }
}