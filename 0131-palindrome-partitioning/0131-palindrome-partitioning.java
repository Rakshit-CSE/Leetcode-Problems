class Solution {
    public List<List<String>> partition(String s) {
        List<String> lst = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        fun(s,lst,ans);
        return ans;
    }
    public static void fun(String ques, List<String> lst,List<List<String>> ans)
    {
        if(ques.length()==0)
        {
            ans.add(new ArrayList<>(lst));
            return;
        }
        for(int i=1;i<=ques.length();i++)
        {
            String temp = ques.substring(0,i);
            if(ispal(temp)==true)
            {
                lst.add(temp);
                fun(ques.substring(i),lst,ans);
                lst.remove(lst.size()-1);
            }
        }
    }
    public static boolean ispal(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}
		return true;
    }
}