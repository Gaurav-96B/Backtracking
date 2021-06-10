class Solution {
    int res = 0, empty = 1;
    public int uniquePathsIII(int[][] grid) {
        int sx=0;
        int sy=0;
        for(int i = 0; i < grid.length;i++) 
        {
            for (int j = 0; j < grid[i].length;j++) 
            {
                if (grid[i][j] == 0)
                {
                    empty++;
                }
                else if (grid[i][j] == 1) 
                {
                    sx = i;
                    sy = j;
                }
            }
        }
        dfs(grid, sx, sy);
        return res;
    }
    public void dfs(int[][] grid, int i, int j) 
    {
        if (i< 0 || i >= grid.length || j< 0 || j>= grid[i].length || grid[i][j]==-1)
        {
            return;
        }
        if (grid[i][j] == 2) 
        {
            if (empty == 0) 
            {
                res++;
            }
            return;
        }
        int temp=grid[i][j];
        grid[i][j] =-1;
        empty--;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        grid[i][j]=temp;
        empty++;
    }   
}
