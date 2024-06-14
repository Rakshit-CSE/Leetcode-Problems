class Solution {
    public int numSplits(String s) {
        HashMap<Character, Integer> left=new HashMap();
        HashMap<Character, Integer> right=new HashMap();
        int cnt = 0;
        
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            right.put(c, right.getOrDefault(c, 0)+1);
        }
        
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            left.put(c, left.getOrDefault(c, 0)+1);
            if(right.get(c) == 1) {
                right.remove(c);
            }else {
                right.put(c, right.get(c)-1);
            }
            
            if(left.size() == right.size()) cnt++;
        }
        
        return cnt;    
    }
}