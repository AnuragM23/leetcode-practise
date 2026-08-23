class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int low = strs[0].length();
        for(int i=0; i<n; i++) {
            low = Math.min(low, strs[i].length());
        }

        String ans = "";
        for(int i=0; i<low; i++) {
            char letter = strs[0].charAt(i);
            for(int j=0; j<n; j++) {
                if(letter != strs[j].charAt(i)) return ans;
            }
            ans = ans + letter;
        }
        return ans;
    }
}