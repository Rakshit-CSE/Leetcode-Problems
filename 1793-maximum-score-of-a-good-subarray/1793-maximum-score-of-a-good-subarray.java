class Solution {
    public int maximumScore(int[] nums, int k) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && nums[i]<nums[st.peek()])
            {
                int h = nums[st.pop()];
                int r=i;
                if(r-1>=k)
                {
                    if(st.isEmpty())
                    {
                        ans = Math.max(ans,h*r);
                    }
                    else
                    {
                        int l=st.peek();
                        if(l+1<=k)
                        {
                            ans = Math.max(ans,h*(r-l-1));
                        }
                    }
                }
            }
            st.push(i);
        }
        int r = n;
        while(!st.isEmpty())
        {
            int h = nums[st.pop()];  
            if(st.isEmpty())
            {
                ans = Math.max(ans,h*r);
            }
            else
            {
                int l=st.peek();
                if(l+1<=k)
                {
                    ans = Math.max(ans,h*(r-l-1));
                }
            } 
        }
        return ans;
    }
}