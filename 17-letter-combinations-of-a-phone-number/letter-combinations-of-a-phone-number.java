class Solution {
    private List<String> ans;
    private String digits;
    private void helper(String[] map, String cur, int index) {
        if(index == digits.length()){
            ans.add(cur);
            return;
        }

        String digit = ""+digits.charAt(index);
        String charSet = map[Integer.parseInt(digit)];

        for(char c : charSet.toCharArray()) {
            helper(map, cur+c, index+1);
        }
    }
    public List<String> letterCombinations(String digits) {
        this.ans = new ArrayList<>();
        this.digits = digits;
        if(digits.length() == 0) return ans;

        String[] map = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        
        helper(map, "", 0);
        return ans;

    }
}
