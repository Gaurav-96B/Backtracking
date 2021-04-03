class Solution {
    
   public static void findPath1(int m[][],int i,int j,ArrayList<String>ans,String s)
   {
     if(i<0||i>=m.length||j<0||j>=m.length||m[i][j]==0)
     {
         return;
     }
     if(i==m.length-1&&j==m.length-1)
    {
            ans.add(s+"");
            return;
    }
    m[i][j]=0;
    findPath1(m,i+1,j,ans,s+"D");
    findPath1(m,i,j-1,ans,s+"L");
    findPath1(m,i,j+1,ans,s+"R");
    findPath1(m,i-1,j,ans,s+"U");
    m[i][j]=1;
   }
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String>ans=new ArrayList<>();
        String s="";
        findPath1(m,0,0,ans,s);
        return ans;
    }
}
