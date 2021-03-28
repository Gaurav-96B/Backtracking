class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int candidates[]={1,2,3,4,5,6,7,8,9};
        List<List<Integer>>l=new ArrayList<>();
        List<Integer>l1=new ArrayList<>();
        combitionSum(candidates,n,l,l1,0,k);
        return l;
        
    }
    public void combitionSum(int candidates[],int target,List<List<Integer>>l,List<Integer>l1,int startIndex,int k)
    {
        if(target==0&&l1.size()==k)
        {
            l.add(new ArrayList<>(l1));
            return;
        }
        for(int i=startIndex;i<candidates.length;i++)
        {
            if(candidates[i]>target)
            {
                break;
            }
            l1.add(candidates[i]);
            combitionSum(candidates,target-candidates[i],l,l1,i+1,k);
            l1.remove(l1.size()-1);
        }
        return;
    }
    
}
