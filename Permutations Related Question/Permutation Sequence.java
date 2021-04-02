class Solution {
    public String getPermutation(int n, int k) {
        List<String>ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        boolean isUsed[]=new boolean[n+1];
        getPermutesequence(n,ans,sb,k,isUsed);
        return ans.get(k-1);
        
    }
    public void getPermutesequence(int n,List<String>ans,StringBuilder sb,int k,boolean isUsed[])
    {
        if(sb.length()==n)
        {
            ans.add(sb.toString());
        }
        for(int i=1;i<=n;i++)
        {
            if(ans.size()==k)
            {
                break;
            }
            if(isUsed[i]==true)
                continue;
            sb.append(String.valueOf(i));
            isUsed[i]=true;
            getPermutesequence(n,ans,sb,k,isUsed);
            sb.deleteCharAt(sb.length()-1);
            isUsed[i]=false;
            
            
        }
    }
    
}
