class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        fun(0,n,ans);
        return ans;          
    }
    public static void fun(int curr,int n,List<Integer> ans)
    {
        if(curr>n)
        {
            return;
        }
        if(curr!=0)
        {
            ans.add(curr);
        }
        int i=0;
        if(curr==0)
        {
            i=1;
        }
        for(;i<=9;i++)
        {
            fun(curr*10+i,n,ans);
        }
    }
}