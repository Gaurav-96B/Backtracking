class Solution {
    int max=Integer.MIN_VALUE;
    public int getMaximumGold(int[][] grid) {
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                getMax(grid,i,j,0);
            }
        } 
        return max;
    }
    public void getMax(int[][]grid,int x,int y,int sum)
    {
        if(x<0||x>=grid.length||y<0||y>=grid[x].length||grid[x][y]==0)
        {
            return;
        }
        sum=sum+grid[x][y];
        max=Math.max(max,sum);
        
        int temp=grid[x][y];
        grid[x][y]=0;
        getMax(grid,x-1,y,sum);
        getMax(grid,x+1,y,sum);
        getMax(grid,x,y-1,sum);
        getMax(grid,x,y+1,sum);
        sum=sum-grid[x][y];
        grid[x][y]=temp;
        
    }
}
