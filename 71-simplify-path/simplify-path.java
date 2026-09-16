class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();
        String word="";
        path = path+"/";

        for(int i=0; i<path.length(); i++) {
            if(path.charAt(i) == '/'){
                String record = word;
                word = "";
                if(record.length()==0 || record.equals(".")){
                    continue;
                } 
                if(record.equals("..")){
                    if(!stack.isEmpty()) stack.pop();
                    continue;
                }
                stack.push(record);
            } else {
                word = word+path.charAt(i);
            }
        }

        String ans="";
        while(!stack.isEmpty()){
            ans = "/"+stack.pop()+ans;
        }

        return (ans.length()>0)? ans:"/";
    }
}