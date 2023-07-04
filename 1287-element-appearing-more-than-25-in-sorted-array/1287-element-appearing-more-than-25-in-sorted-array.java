class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length/4;
        if(arr.length==1)
        {
            return arr[0];
        }
        for(int i=0;i<arr.length-1;i++)
        {
            int c=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c>n)
            {
                return arr[i];
            }
        }
        return -1;
    }
}