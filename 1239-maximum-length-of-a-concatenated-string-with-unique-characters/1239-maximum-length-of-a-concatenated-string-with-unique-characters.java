class Solution {
    public int maxLength(List<String> arr) {
        return fun(arr,0,"");
    }
    public static int fun(List<String> arr,int index,String current)
    {
        if(!uniq(current))
        {
            return 0;
        }
        int mx = current.length();
        for(int i=index;i<arr.size();i++)
        {
            mx = Math.max(mx,fun(arr,i+1,current+arr.get(i)));
        }
        return mx;
    }
    public static boolean uniq(String str)
    {
        int visited[] = new int[26];
        for(char c: str.toCharArray())
        {
            if(visited[c-'a']>0)
            {
                return false;
            }
            visited[c-'a']++;
        }
        return true;
    }
}