class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>l=new ArrayList<>();
        List<Integer>l1=new ArrayList<>();
        Arrays.sort(nums);
        buildSubset1(nums,l,l1,0);
        return l;
        
    }
    public void buildSubset1(int nums[],List<List<Integer>>l,List<Integer>l1,int startIndex)
    {
        l.add(new ArrayList<>(l1));
        for(int i=startIndex;i<nums.length;i++)
        {
            if(i!=startIndex&&nums[i]==nums[i-1])
            {
                continue;
            }
                l1.add(nums[i]);
                buildSubset1(nums,l,l1,i+1);
                l1.remove(l1.size()-1);
            
        }
    }
}
