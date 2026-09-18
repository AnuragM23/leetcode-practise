class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != ']'){
                stack.push(Character.toString(s.charAt(i)));
            } else {
                String encoded_string="";
                String word = "";
                while(!stack.peek().equals("[")){
                    encoded_string = stack.pop() + encoded_string;
                }
                stack.pop();
                StringBuilder k = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    k.insert(0, stack.pop());
                }

                int count = Integer.parseInt(k.toString());

                for(int j=0; j<count; j++) word = word+encoded_string;

                stack.push(word);
            }
        }

        String ans = "";
        while(!stack.isEmpty()){
            ans = stack.pop()+ans;
        }
        return ans;
    }
}