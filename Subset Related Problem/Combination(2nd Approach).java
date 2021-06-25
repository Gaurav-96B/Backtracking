class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int candidates[]=new int[n];
        int z=1;
        for(int i=0;i<n;i++)
        {
            candidates[i]=z;
            z++;
        }
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        buildCombinition(candidates,ans,curr,k,0);
        return ans;
        
    }
    public void buildCombinition(int candidates[],List<List<Integer>>ans,List<Integer>curr,int k,int startIndex)
    {
        if(curr.size()==k)
        {
            ans.add(new ArrayList<>(curr));
        }
        for(int i=startIndex;i<candidates.length;i++)
        {
            curr.add(candidates[i]);
            buildCombinition(candidates,ans,curr,k,i+1);
            curr.remove(curr.size()-1);
        }
    }
}
