class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            if(i>0) set.add(i);
        }
        for(int i=1; i<=set.size()+1; i++) {
            if(!set.contains(i)) return i;
        }

        return 1;
    }
}