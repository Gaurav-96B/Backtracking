class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) { 
       List<List<Integer>>l=new ArrayList<>();
        List<Integer>l1=new ArrayList<>();
        boolean isUsed[]=new boolean[nums.length];
        Arrays.sort(nums);
        permuteNumber(nums,l,l1,isUsed);
        return l;
  }
    public void permuteNumber(int nums[],List<List<Integer>>l,List<Integer>l1,boolean isUsed[])
    {
        if(l1.size()==nums.length)
        {
            l.add(new ArrayList<>(l1));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i!=0&&nums[i]==nums[i-1]&&isUsed[i-1]==false)
            {
                continue;
            }
            if(isUsed[i])
                continue;
            isUsed[i]=true;
            l1.add(nums[i]);
            permuteNumber(nums,l,l1,isUsed);
            l1.remove(l1.size()-1);
            isUsed[i]=false;
            
        }
    } 
}
