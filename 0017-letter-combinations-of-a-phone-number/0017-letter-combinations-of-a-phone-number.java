class Solution {
    static String key[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        int n = digits.length();
        if(digits.length()==0)
        {
            return ans;
        }
        fun(digits,ans,"");
        return ans;
    }

    public static void fun(String digits,List<String> ans,String res)
    {
        if(digits.length()==0)
        {
            ans.add(res);
            return;
        }
        char ch = digits.charAt(0);
        String press = key[ch-'0'];
        for(int i=0;i<press.length();i++)
        {
            fun(digits.substring(1),ans,res+press.charAt(i));
        }
    }
}