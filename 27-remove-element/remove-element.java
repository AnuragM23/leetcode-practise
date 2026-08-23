class Solution {
    public int removeElement(int[] nums, int val) {
        int p2=-1;
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                p2++;
                int temp = nums[i];
                nums[i] = nums[p2];
                nums[p2] = temp;
            } else {
                count++;
            }
        }

        return nums.length-count;
    }
}