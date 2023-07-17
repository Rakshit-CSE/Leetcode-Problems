class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] year = new int[2051];
        for(int i=0;i<logs.length;i++){
            
            year[logs[i][0]] += 1;
            year[logs[i][1]] -= 1;
        }
        
        int maxNum = year[1950], maxYear = 1950;
        for(int i = 1951; i < year.length; i++){
            year[i] += year[i - 1];  // Generating Prefix Sum
            
            if(year[i] > maxNum){
                maxNum = year[i];
                maxYear = i;
            }
        }
        
        return maxYear;
    }
}