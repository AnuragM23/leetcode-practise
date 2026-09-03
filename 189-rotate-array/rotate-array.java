class Solution {
    private void reverseArray(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        reverseArray(nums, 0, n-1);
        reverseArray(nums, 0, k%n-1);
        reverseArray(nums, k%n, n-1);
    }
}