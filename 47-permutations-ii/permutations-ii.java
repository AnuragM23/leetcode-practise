class Solution {
    private List<List<Integer>> ans;
    private void helper(List<Integer> cur, Map<Integer, Integer> map, int index, int n){
        if(index >= n) {
            ans.add(new ArrayList<>(cur));
            return;
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 0) {
                map.put(entry.getKey(), entry.getValue()-1);
                cur.add(entry.getKey());
                helper(cur, map, index+1, n);
                cur.remove(cur.size()-1);
                map.put(entry.getKey(), entry.getValue()+1);
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        this.ans = new ArrayList<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        helper(new ArrayList<>(), map, 0, nums.length);
        return ans;      
    }
}