class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int len = candyType.length/2;
        int c=1;
        for(int i=1;i<candyType.length;i++)
        {
            if(candyType[i]!=candyType[i-1])
            {
                c++;
            }
        }
        return Math.min(len,c);
    }
}