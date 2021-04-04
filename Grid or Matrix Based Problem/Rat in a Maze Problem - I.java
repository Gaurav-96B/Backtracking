class Solution {
    
   public static void findPath1(int m[][],int x,int y,ArrayList<String>ans,String curr)
   {
    if(x<0||x>=m.length||y<0||y>=m[x].length||m[x][y]==0)
    {
        return;
    }
    if(x==m.length-1&&y==m.length-1)
    {
        ans.add(curr);
    }
    m[x][y]=0;
    findPath1(m,x+1,y,ans,curr+'D');
    findPath1(m,x,y-1,ans,curr+'L');
    findPath1(m,x,y+1,ans,curr+'R');
    findPath1(m,x-1,y,ans,curr+'U');
    m[x][y]=1;
   }
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String>ans=new ArrayList<>();
        String curr="";
        findPath1(m,0,0,ans,curr);
        return ans;
        
    }
}
