class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		subset(arr, 0, ll,ans);
		return ans;
	}

	public static void subset(int[] arr, int i, List<Integer> ll,List<List<Integer>> ans) {
		if (i == arr.length) {
			ans.add(new ArrayList<Integer>(ll));
			return;
		}

		ll.add(arr[i]);
        subset(arr, i + 1, ll,ans);
		ll.remove(ll.size()-1);
        subset(arr, i + 1,ll,ans);
    }
}