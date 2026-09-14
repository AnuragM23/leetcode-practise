class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n]; 
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++) {
            if(!stack.isEmpty()){
                int curr = temperatures[i];
                while(!stack.isEmpty() && temperatures[stack.peek()]<curr){
                    int index = stack.pop();
                    ans[index] = i-index;
                }
            }
            stack.push(i);
        }
        
        return ans;
    }
}
