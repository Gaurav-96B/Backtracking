class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int candidate[]=new int[n];
        for(int i=0;i<n;i++)
        {
            candidate[i]=i+1;
        }
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        combin(candidate,0,ans,curr,k);
        return ans;
        
    }
    public void combin(int candidate[],int startIndex,List<List<Integer>>ans,List<Integer>curr,int k)
    {
       if(curr.size()==k)
       {
           ans.add(new ArrayList<>(curr));
       }
        for(int i=startIndex;i<candidate.length;i++)
        {
            curr.add(candidate[i]);
            combin(candidate,i,ans,curr,k);
            curr.remove(curr.size()-1);
        }
    }
}
