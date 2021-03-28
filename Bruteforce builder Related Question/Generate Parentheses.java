class Solution {
    public void buildParenthesis(int n,int open,int close,int index,List<String>s1,String s)
    {
        if(index==2*n)
        {
            s1.add(s);
            return;
        }
        if(open<n)
        {
            buildParenthesis(n,open+1,close,index+1,s1,s+"(");
        }
        if(close<open)
        {
            buildParenthesis(n,open,close+1,index+1,s1,s+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String>s1=new ArrayList<>();
        String s="";
        buildParenthesis(n,0,0,0,s1,s);
        return s1;
        
    }
}
