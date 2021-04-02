class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        if(candidates==null||candidates.length==0)
        {
            return ans;
        }
        Arrays.sort(candidates);
        CombinationSum(candidates,ans,curr,0,target);
        return ans;
        
    }
     public void CombinationSum(int candidates[],List<List<Integer>>ans,List<Integer>curr,int startindex,int target)
    {
      if(target==0)
      {
          ans.add(new ArrayList<>(curr));
          return;
      }
    for(int i=startindex;i<candidates.length;i++)
    {
        if(i!=startindex&&candidates[i]==candidates[i-1])
        {
            continue;
        }
        if(candidates[i]>target)
        {
            break;
        }
        curr.add(candidates[i]);
        CombinationSum(candidates,ans,curr,i+1,target-candidates[i]);
        curr.remove(curr.size()-1);
    }
    
}
}
