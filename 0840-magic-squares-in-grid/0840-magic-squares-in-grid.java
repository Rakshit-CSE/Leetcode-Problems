class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length-2;i++)
        {
            for(int j=0;j<grid[0].length-2;j++)
            {
                if(fun(grid,i,j))
                {
                    ans++;
                }

            }
        }
        return ans;    
    }

    public static boolean fun(int[][] grid,int row,int col)
    {
        int temp[] = new int[10];
        for(int i=row;i<row+3;i++)
        {
            for(int j=col;j<col+3;j++)
            {
                if(grid[i][j]<1 || grid[i][j]>9 || temp[grid[i][j]]>0)
                {
                    return false;
                }
                temp[grid[i][j]]=1;
            }
        }
        int s1 = grid[row][col]+grid[row+1][col+1]+grid[row+2][col+2];
        int s2 = grid[row][col+2]+grid[row+1][col+1]+grid[row+2][col];
        if(s1!=s2)
        {
            return false;
        }
        for(int i=0;i<3;i++)
        {
            if(grid[row+i][col]+grid[row+i][col+1]+grid[row+i][col+2]!=s1)
            {
                return false;
            }
            if(grid[row][col+i]+grid[row+1][col+i]+grid[row+2][col+i]!=s2)
            {
                return false;
            }
        }
        return true;

    }
}