class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        buildSubset(nums,ans,curr,0);
        return ans; 
        
    }
    public void buildSubset(int nums[],List<List<Integer>>ans,List<Integer>curr,int startIndex)
    {

            ans.add(new ArrayList<>(curr));
        for(int i=startIndex;i<nums.length;i++)
        {
            curr.add(nums[i]);
            buildSubset(nums,ans,curr,i+1);
            curr.remove(curr.size()-1);
        }
        return;
    }
}
