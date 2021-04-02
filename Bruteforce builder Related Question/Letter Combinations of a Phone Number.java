class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        if(digits.length()==0)
        {
            return ans;
        }
        StringBuilder curr=new StringBuilder();
        Map<Character,String>map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        letterCombine(digits,ans,curr,map,0);  
        return ans;
    }
    public void letterCombine(String digits,List<String>ans,StringBuilder curr,Map<Character,String>map,int i)
    {
        if(i==digits.length())
        {
            ans.add(curr.toString());
            return;
        }
        String first=map.get(digits.charAt(i));
        for(int k=0;k<first.length();k++)
        {
            curr.append(first.charAt(k));
            letterCombine(digits,ans,curr,map,i+1);
            curr.deleteCharAt(curr.length()-1);
        }
        
    }
    
}
