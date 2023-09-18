class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int ans[] = new int[mat.length];
        for(int i=0;i<mat.length;i++)
        {
            int c=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                {
                    c++;
                }
            }
            ans[i]=c;
        }
        int temp[] = new int[mat.length];
        for(int i=0;i<mat.length;i++)
        {
            temp[i] = ans[i];
        }
        Arrays.sort(temp);
        int x=0;
        int arr2[] = new int[k];
        while(k>0)
        {   
            int search=temp[x];
            for(int i=0;i<ans.length;i++)
            {
                if(search==ans[i])
                {
                    arr2[x]=i;
                    ans[i]=-1;
                    x++;
                    break;
                }
            }
            k--;
        }
        return arr2;
        
        
    }
}