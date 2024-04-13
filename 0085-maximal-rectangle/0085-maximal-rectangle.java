class Solution {
    public int maximalRectangle(char[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int arr[][] = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=(matrix[i][j]-'0');
            }
        }
        int temp[] = new int[c];
        int ans = 0;
        for(int i=r-1;i>=0;i--)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]==1)
                {
                    temp[j]=temp[j]+1;
                }
                else
                {
                    temp[j]=0;
                }
            }
            int ar = area(temp);
            ans=Math.max(ar,ans);

        }
        return ans;
    }

    public static int area(int arr[])
    {
        Stack<Integer> st = new Stack<>();
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[i]<arr[st.peek()])
            {
                int h = arr[st.pop()];
                int r = i;
                if(st.isEmpty())
                {
                    ans = Math.max(ans,h*r);
                }
                else
                {
                    int l=st.peek();
                    ans = Math.max(ans,h*(r-l-1));
                }
            }
            st.push(i);
        }
        int r = arr.length;
        while(!st.isEmpty())
        {
            int h = arr[st.pop()];
            if(st.isEmpty())
            {
                ans = Math.max(ans,h*r);
            }
            else
            {
                int l=st.peek();
                ans = Math.max(ans,h*(r-l-1));
            }
        }
        return ans;
    }
}