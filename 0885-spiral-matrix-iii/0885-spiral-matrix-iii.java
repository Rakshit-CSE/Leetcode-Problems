//Java Code
class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] Indexmatrix = new int[rows * cols][2];
        int Index = 1;
        int rowvalue = 1;
        int increasingvalue = 1;
        Indexmatrix[0][0] = rStart;
        Indexmatrix[0][1] = cStart;
        while (Index < rows * cols) {
            for (int i = 1; i <= increasingvalue; i++) {
                cStart++;
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    Indexmatrix[rowvalue][0] = rStart;
                    Indexmatrix[rowvalue][1] = cStart;
                    rowvalue++;
                    Index++;
                }
            }
            for (int i = 1; i <= increasingvalue; i++) {
                rStart++;
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    Indexmatrix[rowvalue][0] = rStart;
                    Indexmatrix[rowvalue][1] = cStart;
                    rowvalue++;
                    Index++;
                }
            }
            increasingvalue++;
            for (int i = 1; i <= increasingvalue; i++) {
                cStart--;
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    Indexmatrix[rowvalue][0] = rStart;
                    Indexmatrix[rowvalue][1] = cStart;
                    rowvalue++;
                    Index++;
                }
            }
            for (int i = 1; i <= increasingvalue; i++) {
                rStart--;
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    Indexmatrix[rowvalue][0] = rStart;
                    Indexmatrix[rowvalue][1] = cStart;
                    rowvalue++;
                    Index++;
                }
            }
            increasingvalue++;
        }
        return Indexmatrix;
    }
}