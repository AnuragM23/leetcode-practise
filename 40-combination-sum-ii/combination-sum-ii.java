class Solution {
    private List<List<Integer>> ans;
    private int[] nums;
    private void helper(List<Integer> arr, int index, int target){
        if(target == 0) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        if(target<0 || index>=nums.length) return;

        arr.add(nums[index]);
        helper(arr, index+1, target-nums[index]);
        arr.remove(arr.size()-1);
        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }
        helper(arr, index+1, target);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.nums = candidates;
        Arrays.sort(this.nums);
        this.ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        helper(arr, 0, target);
        return ans;
    }
}
