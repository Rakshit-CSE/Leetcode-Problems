class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row1 = 0, row2 = matrix.length-1, col1 = matrix[0].length-1, col2=0;
        while(row1 < matrix.length && col1 >= 0 && row2 >=0 && col2 < matrix[0].length && row2 >= row1  && col1 >= col2){
            if(matrix[row1][col1] == target || matrix[row2][col2] == target)
                return true;
            if(matrix[row1][col1] > target)
                col1--;
            else
                row1++;
            if(matrix[row2][col2] > target)
                row2--;
            else
                col2++;
        }
        return false;
    }
}