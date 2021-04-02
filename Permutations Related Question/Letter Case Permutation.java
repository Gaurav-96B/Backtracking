class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String>ans=new ArrayList<>();
        String s="";
        letterCaseSolve(S,ans,s,0); 
        return ans;
    }
    public void letterCaseSolve(String S,List<String>ans,String s,int index)
    {
        if(s.length()==S.length())
        {
            ans.add(s);
            return;
        }
        if(S.charAt(index)>='0'&&S.charAt(index)<='9')
        {
            letterCaseSolve(S,ans,s+S.charAt(index),index+1);
        }
        else
        {
            letterCaseSolve(S,ans,s+Character.toLowerCase(S.charAt(index)),index+1);
            letterCaseSolve(S,ans,s+Character.toUpperCase(S.charAt(index)),index+1);
        }
    }
}
