class Solution {
    public long wonderfulSubstrings(String word) {
        long result=0;
        HashMap<Integer,Integer> mp= new HashMap<>();
        int xor_all=0;
        mp.put(0,1);
        for(char ch:word.toCharArray()){
            int val=ch-'a';
            //1<<val-binary representation of val
            xor_all^=(1<<val);
            if(mp.containsKey(xor_all))//for substrings with even characters
            result+=mp.get(xor_all);
            for(char it='a';it<='j';it++){
                int  value=it-'a';
                int temp=1<<value;
                if(mp.containsKey(xor_all^temp))
                result+=mp.get(xor_all^temp);
            }
            mp.put(xor_all,mp.getOrDefault(xor_all,0)+1);
        }
        return result;
    }
}