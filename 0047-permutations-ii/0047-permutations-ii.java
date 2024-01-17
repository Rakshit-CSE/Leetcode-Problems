class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        List<List<Integer>> l2 = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        HashSet<ArrayList<Integer>> st = new HashSet<>();
        fun(nums,l1,l2,visited,st);
        return l2;
    }
    public static void fun(int[] nums,List<Integer> l1,List<List<Integer>> l2,boolean[] visited,HashSet<ArrayList<Integer>> st)
    {
        if(l1.size()>=nums.length)
        {
            if(!st.contains(l1))
            {
                st.add(new ArrayList(l1));
                l2.add(new ArrayList(l1));
            }
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(visited[i]==true) continue;

            visited[i]=true;
            l1.add(nums[i]);
            fun(nums,l1,l2,visited,st);
            visited[i]=false;
            l1.remove(l1.size()-1);
        }
    }
}