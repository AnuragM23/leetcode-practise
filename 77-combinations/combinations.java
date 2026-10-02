class Solution {
    private List<List<Integer>> ans;
    private void helper(List<Integer> arr, int cur, int n, int k){
        if(k==0) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        if(k<0 || cur>n) return;

        arr.add(cur);
        helper(arr, cur+1, n, k-1);
        arr.remove(arr.size()-1);
        helper(arr, cur+1, n, k);
    }
    public List<List<Integer>> combine(int n, int k) {
        this.ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        helper(arr, 1, n, k);
        return ans;
    }
}