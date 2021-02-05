class Solution {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        String[] p=path.split("/");
        for(String t:p)
        {
            if(!s.isEmpty() && t.equals(".."))
            {
                s.pop();
            }
            else
                if(!t.equals(".") && !t.equals("") && !t.equals(".."))
                {
                    s.push(t);
                }
        }
        return "/"+String.join("/",s);
    }
}