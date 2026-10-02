class Solution {
    private int[] nums;
    private List<List<Integer>> ans = new ArrayList<>();

    private void helper(List<Integer> arr, int index, int target){
        if(target == 0){
            ans.add(new ArrayList<>(arr));
            return;
        }
        if(target < 0 || index>=nums.length) return;

        arr.add(nums[index]);
        helper(arr, index, target-nums[index]);
        arr.remove(arr.size()-1);
        helper(arr, index+1, target);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        this.ans = new ArrayList<>();
        this.nums = nums;
        List<Integer> arr = new ArrayList<>();
        helper(arr, 0, target);
        return ans;
    }
}
