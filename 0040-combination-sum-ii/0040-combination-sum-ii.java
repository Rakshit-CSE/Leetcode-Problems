class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> lst = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        fun(candidates,target,lst,ans,0);
        return ans;
    }
    public static void fun(int[] arr,int amount,List<Integer> lst,List<List<Integer>> ans, int idx)
    {
        if(amount==0)
        {
            ans.add(new ArrayList<>(lst));
            return;
        }
        for(int i=idx;i<arr.length;i++)
        {
            if(i!=idx  && arr[i]==arr[i-1]) {
				continue;
			}
            if(amount>=arr[i])
            {
                lst.add(arr[i]);
                fun(arr,amount-arr[i],lst,ans,i+1);
                lst.remove(lst.size()-1);
            }
        }
    }

}