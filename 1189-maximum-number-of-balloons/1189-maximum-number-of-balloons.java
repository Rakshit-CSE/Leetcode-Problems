class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        char[] sChar = text.toCharArray();

        for(char c: sChar){
            if (map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }
            else{
                map.put(c,1);
            }
        }

        int a = 0, b = 0, l = 0, o = 0, n = 0;

        for(var item: map.entrySet()){
            char c = item.getKey();
            int count = item.getValue();
            if(c == 'a')
                a += count;
            else if (c == 'b')
                b += count;
            else if (c == 'l')
                l += count;
            else if (c == 'o')
                o += count;
            else if (c == 'n')
                n += count;
        }
        return Math.min(a,Math.min(b,Math.min(l/2,Math.min(o/2,n))));
    }
}