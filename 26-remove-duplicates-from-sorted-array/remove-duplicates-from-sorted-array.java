class Solution {
    public int removeDuplicates(int[] nums) {
        int index=1, i=0, j=1;
        int n = nums.length;
        while(j<n) {
            if(nums[j] != nums[i]){
                nums[index++] = nums[j];
                i = j;
            }
            j++;
        }
        return index;
    }
}