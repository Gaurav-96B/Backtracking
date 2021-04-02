class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int candidates[]={1,2,3,4,5,6,7,8,9};
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        combitionSum(candidates,n,ans,curr,0,k);
        return ans;   
    }
    public void combitionSum(int candidates[],int target,List<List<Integer>>ans,List<Integer>curr,int startIndex,int k)
    {
        if(target==0&&curr.size()==k)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=startIndex;i<candidates.length;i++)
        {
            if(candidates[i]>target)
            {
                break;
            }
            curr.add(candidates[i]);
            combitionSum(candidates,target-candidates[i],ans,curr,i+1,k);
            curr.remove(curr.size()-1);
        }
        return;
    }
    
    
    
    
}
