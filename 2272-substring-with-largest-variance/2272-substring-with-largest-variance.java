class Solution {
    public int largestVariance(String s) {
        HashSet<Character> st = new HashSet<>();
        for(char c: s.toCharArray())
        {
            st.add(c);
        }

        int maxVariance=0;

        for (int runs = 0; runs < 2; runs++) 
        {
            for (char l1 : st) 
            {
                for (char l2 : st)
                {
                    if (l1 == l2) 
                    {
                        continue;
                    }
                    int count1 = 0;
                    int count2 = 0;
                    for (char letter : s.toCharArray()) 
                    {
                        if (letter == l1) 
                        {
                            count1++;
                        } 
                        else if (letter == l2) 
                        {
                            count2++;
                        }
                        if (count1 < count2) 
                        {
                            count1 = count2 = 0;
                        } 
                        else if (count1 > 0 && count2 > 0) 
                        {
                            maxVariance = Math.max(maxVariance, count1 - count2);
                        }
                    }
                }
            }
        // Reverse the string for the second time around
            s = new StringBuilder(s).reverse().toString();
        }

        return maxVariance;
    }
}