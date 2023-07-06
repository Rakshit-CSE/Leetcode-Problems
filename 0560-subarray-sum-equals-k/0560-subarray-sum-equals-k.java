class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixArr[] = new int [nums.length + 1];
    prefixArr[0] = 0;
    for(int i = 1; i <= nums.length; i++){
        prefixArr[i] = prefixArr[i - 1] + nums[i - 1];
    }
    int ans = 0;
    for(int i = 0; i < prefixArr.length; i++){
        for(int j = i + 1; j < prefixArr.length; j++){
            if(prefixArr[j] - prefixArr[i] == k){
                ans++;
            }
        }
    }
    return ans;
    }
}