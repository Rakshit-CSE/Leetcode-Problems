class Solution {
    public int[][] generateMatrix(int n) {
        int v=1;
        int c=0;
        int total=(n*n)-1;
        int ec=n-1;
        int er=n-1;
        int sc=0;
        int sr=0;
        int arr[][] = new int[n][n];
        while(c<=total)
        {
            for(int i=sc;i<=ec && c<=total;i++)
            {
                arr[sr][i]=v;
                v++;
                c++;
            }
            sr++;
            for(int i=sr;i<=er && c<=total;i++)
            {
                arr[i][ec]=v;
                v++;
                c++;
            }
            ec--;
            for(int i=ec;i>=sc && c<=total;i--)
            {
                arr[er][i]=v;
                v++;
                c++;
            }
            er--;
            for(int i=er;i>=sr && c<=total;i--)
            {
                arr[i][sc]=v;
                v++;
                c++;
            }
            sc++;            
        }
        return arr;
    }
}