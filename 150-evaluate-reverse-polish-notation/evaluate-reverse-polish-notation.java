class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(String s : tokens) {
            if("+/-*".contains(s)){
                int second = stack.pop();
                int first = stack.pop();

                if(s.equals("+")){
                    stack.push(first+second);
                } else if(s.equals("-")){
                    stack.push(first-second);
                } else if(s.equals("*")){
                    stack.push(first*second);
                } else {
                    stack.push(first/second);
                }
            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.isEmpty()? -1 : stack.pop();
    }
}