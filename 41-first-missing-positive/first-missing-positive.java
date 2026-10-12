class Solution {
    public int firstMissingPositive(int[] nums) {
        int ans=1;
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == ans){
                ans++;
            }
        }

        return ans;
    }
}