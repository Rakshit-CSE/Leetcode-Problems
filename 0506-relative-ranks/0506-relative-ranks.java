class Solution {
    public String[] findRelativeRanks(int[] score) {
        int arr[] = new int[score.length];
        for(int i=0;i<score.length;i++)
        {
            arr[i] = score[i];
        }
        Arrays.sort(arr);
        String st[] = new String[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(i==arr.length-3)
            {
                st[i]="Bronze Medal";
            }
            else if(i==arr.length-2)
            {
                st[i]="Silver Medal";
            }
            else if(i==arr.length-1)
            {
                st[i]="Gold Medal";
            }
            else
            {
                st[i]=String.valueOf(arr.length-i);
            }
        }
        String ans[] = new String[st.length];
        for(int i=0;i<score.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(score[i]==arr[j])
                {
                    ans[i]=st[j];
                }
            }
        }
        return ans;
    }
}