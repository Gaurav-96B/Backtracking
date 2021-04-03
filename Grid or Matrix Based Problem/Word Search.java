class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                   if(dfs(board,word,i,j,0))
                   {
                        return true;
                   }
                    
                }
            }
        }
        return false;
        
    }
    public boolean dfs(char board[][],String words,int x,int y,int count)
    {
        if(count==words.length())
        {
            return true;
        }
        if(x<0||x>=board.length||y<0||y>=board[x].length||board[x][y]!=words.charAt(count))
        {
          return false;  
        }
           char temp=board[x][y];
                board[x][y]='*';
        boolean ans=dfs(board,words,x+1,y,count+1)||
                    dfs(board,words,x-1,y,count+1)||
                    dfs(board,words,x,y+1,count+1)||
                     dfs(board,words,x,y-1,count+1);
                     board[x][y]=temp;
        return ans;
    }
}
