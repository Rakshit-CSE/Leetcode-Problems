class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> list = new HashSet<>();
        
        for(String x: dictionary)
        {
            list.add(x);
        }
        
        int len = s.length();
        
        int arr[] = new int[len+1];
        
        for(int j=1;j<=len;j++)
        {
            arr[j] = arr[j-1]+1;
            for(int k=j;k>=1;k--)
            {
                String temp = s.substring(k-1,j);
                if(list.contains(temp))
                {
                    arr[j] = Math.min(arr[j],arr[k-1]);
                }
            }
        }
        return arr[len];
    }
}