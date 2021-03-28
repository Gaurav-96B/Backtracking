class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>l=new ArrayList<>();
        List<String>l1=new ArrayList<>();
        partion(s,l,l1,0);
        return l;
        
    }
    public void partion(String s,List<List<String>>l,List<String>l1,int startIndex)
    {
        if(startIndex==s.length())
        {
            l.add(new ArrayList<>(l1));
        }
        for(int i=startIndex;i<s.length();i++)
        {
            if(isPallindrom(s,startIndex,i))
            {
                l1.add(s.substring(startIndex,i+1));
                partion(s,l,l1,i+1);
                l1.remove(l1.size()-1);
                
            }
        }
    }
    public boolean isPallindrom(String s,int low,int high)
    {
        while(low<high)
        {
            if(s.charAt(low)!=s.charAt(high))
            {
                return false;
            }
            else
            {
            low++;
            high--;
            }
        }
        return true;
    }
}
