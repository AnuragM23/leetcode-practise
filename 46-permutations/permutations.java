class Solution {
    private List<List<Integer>> ans;
    private int[] nums;
    private void helper(List<Integer> cur, int[] marked) {
        if(cur.size() == nums.length) {
            ans.add(new ArrayList<>(cur));
            return;
        }

        for(int i=0; i<marked.length; i++){
            if(marked[i] == 0){
                marked[i] = 1;
                cur.add(nums[i]);
                helper(cur, marked);
                marked[i] = 0;
                cur.remove(cur.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int[] marked = new int[nums.length];
        this.ans = new ArrayList<>();
        this.nums = nums;
        helper(new ArrayList<>(), marked);
        return ans;
    }
}
