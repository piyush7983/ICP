import java.util.Stack;
class Solution {
    public static void main(String[] args) {
        String[] tokens={"2","1","+","3","*"};
        Solution obj=new Solution();
        int ans=obj.evalRPN(tokens);
        System.out.println(ans);
    }
    public int evalRPN(String[] tokens) {
        Stack <String> stc= new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String a =tokens[i];
            if(tokens[i].equals("+") || tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                String s=stc.pop();
                int two =Integer.parseInt(s);
                String f=stc.pop();
                int one =Integer.parseInt(f);

                if (tokens[i].equals("+")){
                    int res= one+two;
                    a=Integer.toString(res);
                    

                }
            
                if (tokens[i].equals("-")){
                    int res= one-two;
                    a=Integer.toString(res);
                }
                if (tokens[i].equals("*")){
                    int res= one*two;
                    a=Integer.toString(res);
                }
                if (tokens[i].equals("/")){
                    int res= one/two;
                   a=Integer.toString(res);
                }
            }

            stc.push(a);
        }
        String ans= stc.pop();
        int solu=Integer.parseInt(ans);
        return solu;
    }
}