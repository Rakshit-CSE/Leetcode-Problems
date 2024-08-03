class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=target[i])
            {
                flag=1;
            }
        }
        if(flag==1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
