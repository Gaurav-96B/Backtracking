class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>l=new ArrayList<>();
        List<Integer>l1=new ArrayList<>();
        buildSubset(nums,l,l1,0);
        return l; 
        
    }
    public void buildSubset(int nums[],List<List<Integer>>l,List<Integer>l1,int startIndex)
    {

            l.add(new ArrayList<>(l1));
        for(int i=startIndex;i<nums.length;i++)
        {
            l1.add(nums[i]);
            buildSubset(nums,l,l1,i+1);
            l1.remove(l1.size()-1);
        }
        return;
    }
}
