class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        combineSum(candidates,ans,curr,0,target);
        return ans;
        
    }
public void combineSum(int candidates[],List<List<Integer>>ans,List<Integer>curr,int startIndex,int target)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(curr));
        }
        for(int i=startIndex;i<candidates.length;i++)
        {
            if(candidates[i]>target)
            {
               continue;
            }
            curr.add(candidates[i]);
            combineSum(candidates,ans,curr,i,target-candidates[i]);
            curr.remove(curr.size()-1);
        }
    }
}
