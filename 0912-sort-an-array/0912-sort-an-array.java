class Solution {
    public int[] sortArray(int[] nums) {
        int ans[] = merge_sort(nums,0,nums.length-1);
        return ans;
    }
    public static int[] merge_sort(int[] arr,int lo,int hi)
    {
        if(hi==lo)
        {
            int ans[] = new int[1];
            ans[0]=arr[lo];
            return ans;
        }
        int mid=(lo+hi)/2;
        int[] arr1 = merge_sort(arr,lo,mid);
        int[] arr2 = merge_sort(arr,mid+1,hi);
        return merge_twosorted_array(arr1,arr2);
    }
    public static int[] merge_twosorted_array(int arr1[],int arr2[])
    {
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0;
        int j=0;
        int k=0;
        int ans[] = new int[n1+n2];
        while(i<n1 && j<n2)
        {
            if(arr1[i]<=arr2[j])
            {
                ans[k]=arr1[i];
                i++;
                k++;
            }
            else
            {
                ans[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<n1)
        {
            ans[k]=arr1[i];
            k++;
            i++;
        }
        while(j<n2)
        {
            ans[k]=arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}