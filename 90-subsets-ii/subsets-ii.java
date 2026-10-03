class Solution {
    private List<List<Integer>> ans;
    private int[] nums;
    private void helper(List<Integer> cur, int index){
        if(index >= nums.length) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        
        cur.add(nums[index]);
        helper(cur, index+1);
        cur.remove(cur.size()-1);
        
        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }
        helper(cur, index+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        this.ans = new ArrayList<>();
        Arrays.sort(nums);
        this.nums = nums;
        helper(new ArrayList<>(), 0);
        return this.ans;
    }
}
