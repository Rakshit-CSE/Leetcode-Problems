class Solution {
    public int numSpecial(int[][] mat) {
        int c=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1 && row(mat,i)==true && col(mat,j) == true)
                {
                    c++;
                } 
            }
        }
        return c;
    }
    public boolean row(int[][] mat,int i)
    {
        int c=0;
        for(int j=0;j<mat[i].length;j++)
        {
            if(mat[i][j]==1)
            {
                c++;
            }
        }
        if(c==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean col(int[][] mat,int j)
    {
        int c=0;
        for(int i=0;i<mat.length;i++)
        {
            if(mat[i][j]==1)
            {
                c++;
            }
        }
        if(c==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}