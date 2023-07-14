class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int i=0;
        int j=0;
        int c=0;
        while(i<startTime.length && j<endTime.length)
        {
            for(int k=startTime[i];k<=endTime[j];k++)
            {
                if(k==queryTime)
                {
                    c++;
                }
            }
            i++;
            j++;
        }
        return c;
    }
}