class Solution {
    public double average(int[] salary) {
        double ans = 0;
        Arrays.sort(salary);
        int c=0;
        double s=0;
        for(int i=1;i<salary.length-1;i++)
        {
            s+=salary[i];
            c++;
        }
        ans = s/c;
        return ans;
    }
}