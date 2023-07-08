class Solution {
    public boolean isIsomorphic(String s1, String s2) {
        
	    int n1 = s1.length();
	    int n2 = s2.length();
	    
	    if(n1!=n2) return false;
	    
	    HashMap<Character,Character> mp = new HashMap<>();
	    for(int i=0;i<n1;i++)
	    {
	        if(mp.containsKey(s1.charAt(i)))
	        {
	            if(mp.get(s1.charAt(i))!=s2.charAt(i))
	            {
	                return false;
	            }
	        }
	        else if(mp.containsValue(s2.charAt(i)))
	        {
	            return false;
	        }
	        else
	        {
	            mp.put(s1.charAt(i),s2.charAt(i));
	        }
	    }
	    return true;

    }
}