import java.util.Stack;
class Solution {
    public static void main(String[] args) {
        String path="/a/./b/../../c/";
        Solution obj=new Solution();
        String ans=obj.simplifyPath(path);
        System.out.println(ans);
    }
    public String simplifyPath(String path) {
        Stack<String>st=new Stack<>();
        int i=0;
        while(i<path.length()){
            if(path.charAt(i)=='.'){
                String str="";
                while(i<path.length() && ((path.charAt(i)=='.') || !(path.charAt(i)=='/'))){
                    str+=path.charAt(i++);
                }
                if(str.length()==2 && str.charAt(0)=='.' && str.charAt(1)=='.' && (!st.isEmpty())){
                    st.pop();
                    if(!st.isEmpty()){
                        st.pop();
                    }
                    if(!st.isEmpty()){
                        st.pop();
                    }
                }else if(str.length()>=2){
                    st.push(str);
                }else{
                    st.pop();
                }
            }else if(path.charAt(i)=='/'){
                while(i<path.length() && path.charAt(i)=='/'){
                    i++;
                }
                st.push("/");
            }else{
                String str="";
                while(i<path.length() && !(path.charAt(i)=='/')){
                    str+=path.charAt(i++);
                }
                st.push(str);
            }
        }
        if(st.size()>1 && st.peek().equals("/")){
            st.pop();
        }
        if(st.isEmpty()){
            st.push("/");
        }
        return String.join("", st);
    }
}