class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       int h[] = new int[heights.length];      
        for(int i=0;i<h.length;i++)
        {
            h[i] = heights[i];
        }
        Arrays.sort(h);
        int j=h.length-1;
        String ans[] = new String[names.length];
        int k=0;
        while(j>=0)
        {
            for(int i=0;i<heights.length;i++)
            {
                if(h[j]==heights[i])
                {
                    ans[k]=names[i];
                    k++;
                    j--;
                    if(j<0) break;
                }
            }
        }
        return ans; 
    }
}