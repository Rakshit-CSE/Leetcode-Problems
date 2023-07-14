class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int arr[] = new int[releaseTimes.length];
        int idx = 0;
        arr[0] = releaseTimes[0];
        for(int i=1;i<releaseTimes.length;i++)
        {
            arr[i] = Math.abs(releaseTimes[i]-releaseTimes[i-1]);
        }
        int max = arr[0];
        for(int i=1;i<releaseTimes.length;i++)
        {
            if(arr[i]>max)
            {
                idx=i;
                max=arr[i];
            }
            else if(arr[i]==max)
            {
                if(keysPressed.charAt(i)>keysPressed.charAt(idx))
                {
                    idx=i;
                }
            }
        }
        return keysPressed.charAt(idx);
    }
}