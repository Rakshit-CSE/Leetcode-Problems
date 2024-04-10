class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] ans = new int[deck.length];
        int k = 1, c = 0;
        ans[0] = deck[0];

        while(k < deck.length){
            for(int i = 1; i < deck.length; i++){
                if(ans[i] == 0){
                    c++;
                    if(c == 2){
                        ans[i] = deck[k++];
                        c = 0;
                    }
                }
            }
        }
        return ans;
    }
}