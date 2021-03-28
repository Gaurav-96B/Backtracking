class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>combination=new ArrayList<>();
        if(candidates==null||candidates.length==0)
        {
            return result;
        }
        Arrays.sort(candidates);
        CombinationSum(candidates,result,combination,0,target);
        return result;
         
    }
public void CombinationSum(int candidates[],List<List<Integer>>l,List<Integer>combination,int startindex,int target)
    {
      if(target==0)
      {
          l.add(new ArrayList<>(combination));
          return;
      }
    for(int i=startindex;i<candidates.length;i++)
    {
        if(candidates[i]>target)
        {
            break;
        }
        combination.add(candidates[i]);
        CombinationSum(candidates,l,combination,i,target-candidates[i]);
        combination.remove(combination.size()-1);
    }
    
    }
}
