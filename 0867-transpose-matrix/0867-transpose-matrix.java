class Solution {
    public int[][] transpose(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int arr[][] = new int[c][r];
        for(int row=0;row<matrix.length;row++)
        {
            for(int col=0;col<matrix[row].length;col++)
            {
                arr[col][row]=matrix[row][col];
            }
        }
        return arr;

        
    }
}