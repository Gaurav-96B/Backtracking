import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int found=-1;
    public static void print(int visited[][])
    {
        for(int i=0;i<visited.length;i++)
        {
            for(int j=0;j<visited.length;j++)
            {
                System.out.print(visited[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void findPath1(int m[][],int x,int y,int visited[][])
    {
      if(found==1)
      {
          return;
      }
      if(x==m.length-1&&y==m.length-1)
      {
          found=1;
          visited[x][y]=1;
          print(visited);
          return;
      }
      if(x<0||x>=m.length||y<0||y>=m[x].length||visited[x][y]==1||m[x][y]==0)
        {
            return;
        }
      int temp=m[x][y];
      for(int i=1;i<=temp;i++)
      {
          visited[x][y]=1;
          findPath1(m,x,y+i,visited);
          findPath1(m,x+i,y,visited);
          visited[x][y]=0;
      }
    }
	public static void main (String[] args) {
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m[][]=new int[n][n];
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            m[i][j]=sc.nextInt();
		        }
		    }
		    int visited[][]=new int[n][n];
		    findPath1(m,0,0,visited);
		    if(found==-1)
		    {
		        System.out.println(found);
		    }
		    found=-1;
		}
	}
}
