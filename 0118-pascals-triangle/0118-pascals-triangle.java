class Solution {
    public List<List<Integer>> generate(int numRows) {
      int row=0;
        int star=1;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ArrayList<Integer> res;
        while(row<numRows)
        {
            int i=0;
            int val=1;
            res=new ArrayList<Integer>();
            while(i<star)
            {
                res.add(val);
                val = ((row-i)*val)/(i+1);
                i++;
            }
            ans.add(res);
            row++;
            star++;
        }
        return ans;  
    }
}