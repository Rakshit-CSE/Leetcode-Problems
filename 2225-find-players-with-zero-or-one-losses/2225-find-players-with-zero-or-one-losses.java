class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int l[] = new int[100001];
        for(int i=0;i<matches.length;i++)
        {
            int win = matches[i][0];
            int loss = matches[i][1];
            if(l[win]==0)
            {
                l[win]=-1;
            }
            if(l[loss]==-1)
            {
                l[loss]=1;
            }
            else
            {
                l[loss]++;
            }
        }
        List<Integer> one_loss = new ArrayList<>();
        List<Integer> zero_loss = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            if (l[i] == -1) {
                zero_loss.add(i);
            } else if (l[i] == 1) {
                one_loss.add(i);
            }
        }

        result.add(zero_loss);
        result.add(one_loss);

        return result;
    }
}