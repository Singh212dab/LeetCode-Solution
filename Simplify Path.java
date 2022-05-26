class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < parts.length; i ++){
            if (parts[i].equals("") || parts[i].equals(".")){
                continue;
            }
            else if (parts[i].equals("..")){
                if (!stack.empty()){
                    stack.pop();
                }
            }
            else{
                stack.push(parts[i]);
            }
         }//for
        String res = "";
        if (stack.empty()){
            return "/";
        }
        else{
            while(!stack.empty()){
                res = "/" + stack.pop() + res;
            }
            return res;
        }
    }
}
