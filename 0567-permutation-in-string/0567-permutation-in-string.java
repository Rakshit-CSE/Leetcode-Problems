class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] temp1 = s1.toCharArray();
        Arrays.sort(temp1);
        String ss1 = new String(temp1);
        for(int i=0;i<s2.length()-s1.length()+1;i++)
        {
            String temp2 = s2.substring(i,i+s1.length());
            char[] arr = temp2.toCharArray();
            Arrays.sort(arr);
            String ss2 = new String(arr);
            if(ss1.equals(ss2))
            {
                return true;
            }
        }
        return false;
    }
}


