class Solution {
    public boolean isAnagram(String s1, String s2) {
        int n1 = s1.length();
	    int n2 = s2.length();
	    
	    if(n1!=n2) return false;
	    
	    HashMap<Character,Integer> mp1 = new HashMap<>();
	    HashMap<Character,Integer> mp2 = new HashMap<>();
	    
	    for(int i=0;i<n1;i++)
	    {
	        if(mp1.containsKey(s1.charAt(i)))
	        {
	            mp1.put(s1.charAt(i),mp1.get(s1.charAt(i))+1);
	        }
	        else
	        {
	            mp1.put(s1.charAt(i),1);
	        }
	    }
	    for(int i=0;i<n2;i++)
	    {
	        if(mp2.containsKey(s2.charAt(i)))
	        {
	            mp2.put(s2.charAt(i),mp2.get(s2.charAt(i))+1);
	        }
	        else
	        {
	            mp2.put(s2.charAt(i),1);
	        }
	    }
	    if(mp1.equals(mp2)) return true;
	    else return false;
    }
}