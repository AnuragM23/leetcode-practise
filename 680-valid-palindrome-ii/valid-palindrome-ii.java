class Solution {
     public boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int i=0, j=str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        if(isPalindrome(s)) return true;
        int left = 0, right = s.length()-1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)){
                return isPalindrome(s.substring(0, left)+s.substring(left+1)) || isPalindrome(s.substring(0, right)+s.substring(right+1));
            }
            left++;
            right--;
        }
        

        return false;
    }
}