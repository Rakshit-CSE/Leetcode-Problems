class Solution {
    public String interpret(String command) {
        String ans="";
        for(int i=0;i<command.length()-1;i++)
        {
            if(command.charAt(i)=='(' && command.charAt(i+1)==')')
            {
                ans+='o';
            }
            else if(command.charAt(i)!='(' && command.charAt(i)!=')')
            {
                ans+=command.charAt(i);
            }
        }
        if(command.charAt(command.length()-1)!='(' && command.charAt(command.length()-1)!=')')
        {
            ans += command.charAt(command.length()-1);
        }
        return ans;
    }
}