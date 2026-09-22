class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            int revIndex = 26 - (int)(s.charAt(i)-'a');
            sum = sum + (revIndex * (i+1));
        }
        return sum;
    }
}