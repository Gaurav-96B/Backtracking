class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=i+1;
        }
        generateCombination(nums,ans,curr,k,0);
        return ans;
    }
public void generateCombination(int nums[],List<List<Integer>>ans,List<Integer>curr,int k,int i)
{
    if(curr.size()==k)
    {
        ans.add(new ArrayList<>(curr));
        return;
    }
    if(i==nums.length)
    {
        return;
    }
    curr.add(nums[i]);
    generateCombination(nums,ans,curr,k,i+1);
    
    curr.remove(curr.size()-1);
    generateCombination(nums,ans,curr,k,i+1);
}
   
}
