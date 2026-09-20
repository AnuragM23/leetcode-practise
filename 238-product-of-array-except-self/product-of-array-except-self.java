class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCounter = 0;
        for(int i : nums) {
            if (i!=0){
                product = product * i;
            } else {
                zeroCounter++;
            }
        }

        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            if(zeroCounter > 1){
                break;
            } else if(zeroCounter == 1){
                if(nums[i] == 0){
                    ans[i] = product;
                    break;
                }
            } else {
                ans[i] = (int)(product/nums[i]);
            }
        }
        return ans;
    }
}  
