class Solution {
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        boolean isUsed[]=new boolean[nums.length];
        permuteNumber(nums,ans,curr,isUsed);
        return ans;
  }
public void permuteNumber(int nums[],List<List<Integer>>ans,List<Integer>curr,boolean isUsed[])
    {
        if(curr.size()==nums.length)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(isUsed[i])
                continue;
            isUsed[i]=true;
            curr.add(nums[i]);
            permuteNumber(nums,ans,curr,isUsed);
            curr.remove(curr.size()-1);
            isUsed[i]=false;
        }
    }
}

