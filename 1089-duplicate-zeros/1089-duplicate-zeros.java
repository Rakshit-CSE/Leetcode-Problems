class Solution {
    public void duplicateZeros(int[] arr) {
        int ans[] = new int[arr.length];
        int idx=0;
        for(int i=0;i<arr.length;i++)
        {
            if(idx<ans.length)
            {
                if(arr[i]!=0)
                {
                    ans[idx]=arr[i];
                    idx++;
                }
                else if(arr[i]==0 && idx<ans.length-1)
                {
                    ans[idx]=0;
                    idx+=1;
                    ans[idx]=0;
                    idx++;
                }
                else
                {
                    ans[idx]=0;
                    idx++;
                }
            }
        }
        for(int i=0;i<ans.length;i++)
        {
            arr[i] = ans[i];
        }   
    }
}