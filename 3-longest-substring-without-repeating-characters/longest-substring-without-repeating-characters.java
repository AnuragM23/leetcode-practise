class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character> set = new HashSet<>();
        int l=0, r;
        int maxSubstringLength=0;
        for(r=0; r<n; r++) {
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxSubstringLength = Math.max(maxSubstringLength, r-l+1);
        }
        return maxSubstringLength;
    }
}