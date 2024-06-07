class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String s1Array[] = s1.split(" ");
        String s2Array[] = s2.split(" ");
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(String s: s1Array) 
            map.put(s, map.getOrDefault(s, 0) + 1);
        for(String s: s2Array) 
            map.put(s, map.getOrDefault(s, 0) + 1);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1)
                list.add(entry.getKey());
        }
        return list.toArray(new String[list.size()]);
        
    }
}