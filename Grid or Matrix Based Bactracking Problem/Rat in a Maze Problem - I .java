class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String>ans=new ArrayList<>();
        String curr="";
        printRatPath(m,0,0,curr,ans);
        return ans;
    }
    public static void printRatPath(int m[][],int i,int j,String curr,ArrayList<String>ans)
    {
        if(i<0||i>=m.length||j<0||j>=m[i].length||m[i][j]==0)
        {
            return ;
        }
        if(i==m.length-1&&j==m[i].length-1)
        {
           ans.add(curr);
        }
        int temp=m[i][j];
        m[i][j]=0;
        printRatPath(m,i+1,j,curr+'D',ans);
        printRatPath(m,i,j-1,curr+'L',ans);
        printRatPath(m,i,j+1,curr+'R',ans);
        printRatPath(m,i-1,j,curr+'U',ans);
        m[i][j]=temp;
        
    }
}
