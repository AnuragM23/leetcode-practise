class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int counter = 0;
        int prev = nums[0];
        for(int i=0; i<n; i++) {
            if(nums[i] != prev) {
                if(counter > (n/3)) ans.add(prev);
                prev = nums[i];
                counter = 0;
            }

            counter++;
        }

        if(counter > (n/3)) ans.add(nums[n-1]);

        return ans;
    }
}