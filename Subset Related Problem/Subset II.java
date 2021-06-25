class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        Arrays.sort(nums);
        buildSubset1(nums,ans,curr,0);
        return ans;
        
    }
    public void buildSubset1(int nums[],List<List<Integer>>ans,List<Integer>curr,int startIndex)
    {
        ans.add(new ArrayList<>(curr));
        for(int i=startIndex;i<nums.length;i++)
        {
            if(i!=startIndex&&nums[i]==nums[i-1])
            {
                continue;
            }
                curr.add(nums[i]);
                buildSubset1(nums,ans,curr,i+1);
                curr.remove(curr.size()-1);
            
        }
    }
}
