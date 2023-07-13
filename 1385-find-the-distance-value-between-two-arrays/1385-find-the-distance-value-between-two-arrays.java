class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        for(int i=0;i<arr1.length;i++)
        {
            boolean cinc=true;
            for(int j=0;j<arr2.length;j++)
            {
                int val = arr1[i]-arr2[j];
                if(Math.abs(val)<=d)
                {
                    cinc = false;
                    break;
                }
            }
            if(cinc)
            {
                c++;
            }
        }
        return c;
    }
}