class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        String curr="";
        buildParenthesis(n,0,0,0,ans,curr);
        return ans;   
    }
public void buildParenthesis(int n,int open,int close,int index,List<String>ans,String curr)
    {
        if(index==2*n)
        {
            ans.add(curr);
            return;
        }
        if(open<n)
        {
            buildParenthesis(n,open+1,close,index+1,ans,curr+"(");
        }
        if(close<open)
        {
            buildParenthesis(n,open,close+1,index+1,ans,curr+")");
        }
    }   
}
