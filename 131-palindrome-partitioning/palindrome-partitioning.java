class Solution {
    private List<List<String>> ans;
    private String s;
    private void helper(List<String> cur, int index){
        if(index>=s.length()){
            ans.add(new ArrayList<>(cur));
            return;
        }

        for(int i=index; i<s.length(); i++) {
            if(isPalindrome(s, index, i)){
                cur.add(s.substring(index, i+1));
                helper(cur, i+1);
                cur.remove(cur.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        this.ans = new ArrayList<>();
        this.s = s;
        helper(new ArrayList<>(), 0);
        return ans;
    }
}
