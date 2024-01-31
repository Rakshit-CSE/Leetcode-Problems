class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int ans[] = new int[n];
        int i=0;
        while(i<n)
        {
            while(!st.isEmpty() &&i<n && temperatures[i]>temperatures[st.peek()])
            {
                int idx = st.pop();
                ans[idx] = i-idx;
            }
            st.push(i);
            i++;
        }
        while(!st.isEmpty())
        {
            int idx = st.pop();
            ans[idx] = 0;
        }
        return ans;
    }
}