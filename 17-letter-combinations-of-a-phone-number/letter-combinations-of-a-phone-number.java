class Solution {
    private Map<Character, String> map;
    private List<String> ans;
    private String digits;
    private void helper(String cur, int index) {
        if(index == digits.length()){
            ans.add(cur);
            return;
        }

        char digit = digits.charAt(index);
        String charSet = map.get(digit);

        for(int i=0; i<charSet.length(); i++) {
            helper(cur+charSet.charAt(i), index+1);
        }
    }
    public List<String> letterCombinations(String digits) {
        this.ans = new ArrayList<>();
        this.digits = digits;
        if(digits.length() == 0) return ans;

        this.map = new HashMap<>();
        this.map.put('2', "abc");
        this.map.put('3', "def");
        this.map.put('4', "ghi");
        this.map.put('5', "jkl");
        this.map.put('6', "mno");
        this.map.put('7', "pqrs");
        this.map.put('8', "tuv");
        this.map.put('9', "wxyz");

        helper("", 0);
        return ans;

    }
}
