class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        generateSubset(nums,ans,curr,0);
        return ans;
    }
    public void generateSubset(int nums[],List<List<Integer>>ans,List<Integer>curr,int i)
    {
        if(i==nums.length)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        curr.add(nums[i]);
        generateSubset(nums,ans,curr,i+1);
        
        curr.remove(curr.size()-1);
        generateSubset(nums,ans,curr,i+1);
        
    }
}
