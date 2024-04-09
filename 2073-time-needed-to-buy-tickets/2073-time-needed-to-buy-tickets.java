class Solution {
    public int timeRequiredToBuy(int[] ticketsArray, int position) {
        int numberOfPeople = ticketsArray.length;
        int currentIndex = position;
        int timeTaken = 0;
        
        while (currentIndex >= 0) {
            timeTaken += Math.min(ticketsArray[position], ticketsArray[currentIndex]);
            --currentIndex;
        }
        
        currentIndex = position + 1;
        --ticketsArray[position];
        
        while (currentIndex < numberOfPeople) {
            timeTaken += Math.min(ticketsArray[position], ticketsArray[currentIndex]);
            ++currentIndex;
        }
        
        return timeTaken;
    }
}