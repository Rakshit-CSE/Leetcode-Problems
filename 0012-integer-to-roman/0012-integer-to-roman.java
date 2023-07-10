class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(1,"I");
        mp.put(4,"IV");
        mp.put(5,"V");
        mp.put(9,"IX");
        mp.put(10,"X");
        mp.put(40,"XL");
        mp.put(50,"L");
        mp.put(90,"XC");
        mp.put(100,"C");
        mp.put(400,"CD");
        mp.put(500,"D");
        mp.put(900,"CM");
        mp.put(1000,"M");

        ArrayList<Integer> lst = new ArrayList<>();
        for(int key: mp.keySet())
        {
            lst.add(key);
        }

        Collections.sort(lst,Collections.reverseOrder());

        for(int n: lst)
        {
            while(num>=n)
            {
                sb.append(mp.get(n));
                num-=n;
            }
        }
        return sb.toString();
    }
}