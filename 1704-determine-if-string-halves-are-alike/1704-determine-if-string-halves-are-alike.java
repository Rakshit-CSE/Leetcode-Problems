class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int h = n/2;
        String h1=s.substring(0,h);
        String h2=s.substring(h);
        int c1 = fun(h1);
        int c2 = fun(h2);
        if(c1==c2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int fun(String s)
    {
        HashMap<Character,Integer> mp = new HashMap<>();
        mp.put('a',1);
        mp.put('e',1);
        mp.put('i',1);
        mp.put('o',1);
        mp.put('u',1);
        mp.put('A',1);
        mp.put('E',1);
        mp.put('I',1);
        mp.put('O',1);
        mp.put('U',1);
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(mp.containsKey(c))
            {
                cnt++;
            }
        }
        return cnt;

    }
}