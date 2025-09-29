class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int c=0;
        boolean visited[][] = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    dfs(grid,n,m,visited,i,j);
                    c++;

                }
            }
        }
        return c;
        
        
    }
    public void dfs(char[][] grid,int n,int m,boolean visited[][],int i,int j){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]=='0' || visited[i][j]==true ) {
            return;
        }
        visited[i][j]=true;
        int dr[] ={0,0,1,-1};
        int dc[]={1,-1,0,0};
        
        for(int k=0;k<dr.length;k++){
            
            dfs(grid,n,m,visited,i+dr[k],j+dc[k]);
            
            
        }
        
    }

}