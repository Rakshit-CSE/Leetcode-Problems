class Solution {
    public int numEnclaves(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if((i==0 || j==0 || i==r-1 || j==c-1) && arr[i][j]==1)
                {
                    dfs(arr,i,j,r,c);
                } 
            }
        }
        int ans=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j] == 1)
                {
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void dfs(int arr[][],int i,int j,int r,int c)
    {
        if(i<0 || i>=r || j<0 || j>=c || arr[i][j]==0)
        {
            return;
        }
        arr[i][j]=0;
        dfs(arr,i+1,j,r,c);
        dfs(arr,i-1,j,r,c);
        dfs(arr,i,j+1,r,c);
        dfs(arr,i,j-1,r,c);
    }
}