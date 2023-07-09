class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int count=0;
        int j=0;
        for(int i=1;i<=arr[n-1];i++){
            if(count==k){
                return i-1;
            }
            if(i==arr[j]){
                j++;
            }
            else{
                count++;
            }
        }
        return n+k;
    }
}