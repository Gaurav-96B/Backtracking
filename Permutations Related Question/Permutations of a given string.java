class Solution {
    public List<String> find_permutation(String S) {
        char a[]=S.toCharArray();
        Arrays.sort(a);
        String SortedString=new String(a);
        List<String>ans=new ArrayList<>();
        boolean isUsed[]=new boolean[S.length()];
        StringBuilder sb=new StringBuilder();
        permuteNumber(SortedString,ans,sb,isUsed);
        return ans;
    }
      public void permuteNumber(String S,List<String>ans,StringBuilder sb,boolean isUsed[])
    {
        if(sb.length()==S.length())
        {
            ans.add(sb.toString());
            return;
        }

            for(int i=0;i<S.length();i++)
            {
                if(isUsed[i])
                continue;
            isUsed[i]=true;
            sb.append(S.charAt(i));
            permuteNumber(S,ans,sb,isUsed);
            sb.deleteCharAt(sb.length()-1);
            isUsed[i]=false;
            }
    }
    
    
    
    
    
}
