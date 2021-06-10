class Solution {
    long numberOfPath(int N, int K, int [][]arr) {
        long dp[][][]=new long[N][N][K+1];
        for(long row[][]:dp)
        {
            for(long row1[]:row)
            {
              Arrays.fill(row1,-1);
            }
        }
        return path(arr,N-1,N-1,K,dp);
        
    }
   static long path(int[][] arr, int m, int n, int k,long dp[][][])
   {
	    if(m<0||n<0||k<0){
	        return 0;
	    }
	    if(m==0 && n==0 && arr[m][n]==k){
	        return 1;
	    }
	    if(dp[m][n][k]!=-1){
	        return dp[m][n][k];
	    }
	    dp[m][n][k]=path(arr,m-1,n,k-arr[m][n],dp)+path(arr,m,n-1,k-arr[m][n],dp);
	    return dp[m][n][k];
	}
    
    
}
