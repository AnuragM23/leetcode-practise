class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i=0; i<nums.length-1; i++){
            mpp.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            int dif = target - nums[i];
            if(mpp.containsKey(dif) && mpp.get(dif)!=i){
                return new int[]{i, mpp.get(dif)};
            }
        }
        return new int[]{-1, -1};
    }
}