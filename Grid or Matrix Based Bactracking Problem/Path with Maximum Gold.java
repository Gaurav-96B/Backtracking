class Solution {
   int max=Integer.MIN_VALUE;
    public int getMaximumGold(int[][] grid) {
        int sum=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]!=0)
                {
                getMax(grid,i,j,0); 
                }
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
        int temp=grid[x][y];
        sum=sum+temp;
        max=Math.max(max,sum);
    
        grid[x][y]=0;
        getMax(grid,x-1,y,sum);
        getMax(grid,x+1,y,sum);
        getMax(grid,x,y-1,sum);
        getMax(grid,x,y+1,sum);
        grid[x][y]=temp;
        sum=sum-temp;  
    }
        
}
