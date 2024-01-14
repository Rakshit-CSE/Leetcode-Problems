class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())
        {
            return false;
        }
        HashMap<Character,Integer> mp1 = new HashMap<>();
        HashMap<Character,Integer> mp2 = new HashMap<>();
        for(int i=0;i<word1.length();i++)
        {
            mp1.put(word1.charAt(i),mp1.getOrDefault(word1.charAt(i),0)+1);
        }
        for(int i=0;i<word2.length();i++)
        {
            mp2.put(word2.charAt(i),mp2.getOrDefault(word2.charAt(i),0)+1);
        }
        for(char x:mp1.keySet())
        {
            if(!mp2.containsKey(x)) return false;
        }
        ArrayList<Integer> ls1 = new ArrayList<>();
        ArrayList<Integer> ls2 = new ArrayList<>();

        for(char x: mp1.keySet())
        {
            ls1.add(mp1.get(x));
        }  
        for(char x: mp2.keySet())
        {
            ls2.add(mp2.get(x));
        }
        Collections.sort(ls1);
        Collections.sort(ls2);
        return ls1.equals(ls2);        
    }
}