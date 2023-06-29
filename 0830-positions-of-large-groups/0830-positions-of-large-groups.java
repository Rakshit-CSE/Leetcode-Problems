class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
		int start =0, end=0;

		for(int i=0; i<s.length(); i++){
			if(i== s.length()-1 || s.charAt(i) != s.charAt(i+1)){
				end = i;
				if(end-start +1 >=3){
					list.add(Arrays.asList(start, end));
				}
				start = i+1;
			}
		}
		return list;
    }
}