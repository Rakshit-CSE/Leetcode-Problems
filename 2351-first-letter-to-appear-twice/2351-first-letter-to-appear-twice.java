class Solution {
    public char repeatedCharacter(String s) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    min = Math.min(min,j);
                }
            }
        }
        return s.charAt(min);
    }
}