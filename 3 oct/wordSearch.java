class Solution {
    boolean ans=false;
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        char[] s= word.toCharArray();
        boolean visited[][]=new boolean[n][m];
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==s[0] ){
                    if( dfs(board,i,j,s,visited,0,ans))return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,int i,int j,char[] s,boolean visited[][],int pos,boolean ans){
        if(i<0 || j<0 || j>=board[0].length || i>=board.length || visited[i][j]==true || board[i][j]!=s[pos]){
            return false ;
        }

        visited[i][j]=true;
        int dr[]={0,1,0,-1};
        int dc[]={1,0,-1,0};
        if(pos==s.length-1) {
           
            return true;
        }

        for(int k=0;k<dr.length;k++){
            if(dfs(board,i+dr[k],j+dc[k],s,visited,pos+1,ans)){
                visited[i][j]=false;
                return true;
            }
                
            
        }
        visited[i][j]=false;
        return false;

        
    }
}