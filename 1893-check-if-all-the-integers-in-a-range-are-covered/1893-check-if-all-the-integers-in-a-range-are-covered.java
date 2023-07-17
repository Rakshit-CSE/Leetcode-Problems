class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean arr[] = new boolean[60];
        for(int i=0;i<ranges.length;i++)
        {
            for(int j=ranges[i][0];j<=ranges[i][1];j++)
            {
                arr[j]=true;
            }
        }
        for(int i=left;i<=right;i++)
        {
            if(arr[i]==false)
            {
                return false;
            }
        }
        return true;
    }
}