class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();
        String word="";
        path = path+"/";

        for(int i=0; i<path.length(); i++) {
            if(path.charAt(i) == '/'){
                if(word.length()==0 || word.equals(".")){
                    word="";
                    continue;
                } 
                if(word.equals("..")){
                    if(!stack.isEmpty()) stack.pop();
                    word="";
                    continue;
                }
                stack.push(word);
                word="";
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