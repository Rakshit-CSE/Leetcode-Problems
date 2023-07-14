class Solution {
    public double trimMean(int[] arr) {
        double len = (0.05)*arr.length;
		Arrays.sort(arr);
		double sum=0;
		for(int i=(int)len;i<arr.length-len;i++)
		{
		    sum+=arr[i];
		}
	    len = arr.length-2*len;
		double ans = sum/len;
        return ans; 
    }
}