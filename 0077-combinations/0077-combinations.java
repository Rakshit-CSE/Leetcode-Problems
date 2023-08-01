class Solution {
    public List<List<Integer>> combine(int n, int k) {
        boolean[] board = new boolean[n];
        int no_queen = k;
        List<Integer> l1 = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Combination(board, no_queen,0,0,l1,ans);
        return ans;
    }
    public void Combination(boolean[] board,int tq,int qpsf,int idx,List<Integer>l1,List<List<Integer>> ans)
    {
        if(tq==qpsf)
        {
            ans.add(new ArrayList<Integer>(l1));
            return;
        }
        for(int i=idx;i<board.length;i++)
        {
            if(board[i]==false)
            {
                board[i]=true;
                l1.add(i+1);
                Combination(board,tq,qpsf+1,i+1,l1,ans);
                l1.remove(l1.size()-1);
                board[i]=false;
            }
        }
    }
}