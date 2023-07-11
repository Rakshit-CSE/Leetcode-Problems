class Solution {
    public int mySqrt(int x) {
        int si = 1;
        int ei = x;

        while(si <= ei){
            int mid = (si + ei) / 2;

            if(x / mid == mid){
                return mid;
            } else if(mid > x / mid){
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return ei;      
    }
}