class Solution
{
    public static int NumberOfPath(int a, int b) 
    {
        int dp[][]=new int[a+1][b+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return path(a-1,b-1,dp); 
    }
    static int  path(int m, int n,int dp[][])
   {
	    if(m<0||n<0){
	        return 0;
	    }
	    if(m==0&&n==0){
	        return 1;
	    }
	    if(dp[m][n]!=-1){
	        return dp[m][n];
	    }
	    dp[m][n]=path(m-1,n,dp)+path(m,n-1,dp);
	    return dp[m][n];
	}
}
