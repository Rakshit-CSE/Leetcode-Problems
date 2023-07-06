class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String ans = "";

        Collections.sort(dictionary);

        String arr[] = sentence.split(" ");

        for(int i=0;i<arr.length;i++)
        {
            String s = arr[i];

            for(int j=0;j<dictionary.size();j++)
            {
                if(arr[i].startsWith(dictionary.get(j)))
                {
                    s=dictionary.get(j);
                    break;
                }
            }
            ans+=s;
            if(i!=arr.length-1)
            {
                ans+=' ';
            }
        }
        return ans;
    }
}