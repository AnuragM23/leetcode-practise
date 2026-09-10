class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int ans=0;

        for(String s : operations){
            if(s.equals("+")){
                int temp = stack.pop();
                int sum = temp + stack.peek();
                stack.push(temp);
                stack.push(sum);
            } else if(s.equals("D")){
                if(stack.isEmpty()){
                    stack.push(0);
                } else {
                    stack.push(stack.peek()*2);
                }
            } else if(s.equals("C")){
                if(!stack.isEmpty()) stack.pop();
            } else {
                int num = Integer.parseInt(s);
                stack.push(num);
            }
        }

        while(!stack.isEmpty()){
            ans+=stack.pop();
        }

        return ans;
    }
}