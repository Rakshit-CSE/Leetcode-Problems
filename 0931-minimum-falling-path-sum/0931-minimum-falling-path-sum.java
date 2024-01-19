class Solution {
    public int minFallingPathSum(int[][] A) {
        int r =  A.length;
        int c =  A[0].length;
        int ans = Integer.MAX_VALUE;
        HashMap<String, Integer > hm = new HashMap<>();
        for (int i = 0; i<c; i++)
        {
            ans = Math.min(ans, rec(0, i, A, hm));
        }
        return ans;
    }
    private static int rec(int i, int j, int arr[][], HashMap<String, Integer> hm)
    {
        int r= arr.length;
        int c = arr[0].length;
        if( i == r){
            return 0;
        }
        if(j <0 || j >=c) return Integer.MAX_VALUE;
        String key = i + " " + j;
        if(hm.containsKey (key))
            return hm.get(key);
        int op1 = rec(i+1, j-1, arr, hm);
        int op2 = rec(i+1, j, arr, hm);
        int op3 = rec(i+1, j+1, arr, hm);
        hm.put(key, arr[i][j] + Math.min(op1, Math.min(op2, op3)));
        return arr [i][j] + Math.min (op1, Math.min(op2, op3));
    }
}