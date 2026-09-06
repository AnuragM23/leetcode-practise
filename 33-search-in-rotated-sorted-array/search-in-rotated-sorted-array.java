class Solution {
    private int findPivotIndex(int[] nums){
        int left=0, right=nums.length-1;

        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid] < nums[right]) right=mid;
            else left=mid+1;
        }
        return left;
    }

    private int searchIndex(int[] nums, int left, int right, int target){
        while(left <= right){
            int mid=left+(right-left)/2;
            if(nums[mid] < target) left=mid+1;
            else if(nums[mid] > target) right=mid-1;
            else return mid;
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int pivot = findPivotIndex(nums);
        int n = nums.length;
        if(target > nums[n-1]) {
            return searchIndex(nums, 0, pivot-1, target);
        }
        return searchIndex(nums, pivot, n-1, target);
    }
}
