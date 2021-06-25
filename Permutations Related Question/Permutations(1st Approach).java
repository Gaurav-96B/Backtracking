class Solution {
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        generatePermunation(nums,ans,curr,0);
        return ans;
  }
public void generatePermunation(int nums[],List<List<Integer>>ans,List<Integer>curr,int start)
  {
     if (curr.size() == nums.length) 
    {
      ans.add(new ArrayList<Integer>(curr));
    }
      for (int i=start;i < nums.length; i++) 
      {
        if (curr.contains(nums[i])) {
          continue;
        }
        curr.add(nums[i]);
        generatePermunation(nums,ans,curr,start);
        curr.remove(curr.size()-1);
    }
  
  }
    
}

