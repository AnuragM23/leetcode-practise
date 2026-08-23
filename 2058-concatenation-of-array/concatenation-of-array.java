class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<2*n; i++) {
            arr.add(nums[i%n]);
        }

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}