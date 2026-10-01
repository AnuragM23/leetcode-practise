class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    private void helper(int[] nums, int index, List<Integer> subset) {
        if(index >= nums.length) {
            ans.add(new ArrayList<>(subset));
            return;
        }

        helper(nums, index+1, subset);
        subset.add(nums[index]);
        helper(nums, index+1, subset);
        subset.remove(subset.size()-1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        helper(nums, 0, subset);
        return ans;
    }
}