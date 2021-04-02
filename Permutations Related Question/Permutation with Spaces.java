class Solution{
    
    ArrayList<String> permutation(String S){
       
        ArrayList<String>ans=new ArrayList<>();
        String s="";
        s=s+S.charAt(0);
        int currIndex=1;
        permuteString(S,s,ans,currIndex);
        return ans;
    }
    public void permuteString(String S,String s,ArrayList<String>ans,int currIndex)
    {
        if(currIndex==S.length())
        {
            ans.add(s);
            return;
        }
        permuteString(S,s+" "+S.charAt(currIndex),ans,currIndex+1);
        permuteString(S,s=s+S.charAt(currIndex),ans,currIndex+1);
    }
    
}
