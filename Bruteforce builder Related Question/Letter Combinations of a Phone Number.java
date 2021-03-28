class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        if(digits.length()==0)
        {
            return ans;
        }
        Map<Character,String>map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        lc(digits,0,map,ans,new StringBuilder());
        return ans;   
    }
    public void lc(String digits,int i,Map<Character,String>map,List<String>ans,StringBuilder sb)
    {
      if(i==digits.length()) 
      {
          ans.add(sb.toString());
          return;
      }
        String curr=map.get(digits.charAt(i));
        for(int k=0;k<curr.length();k++)
        {
            sb.append(curr.charAt(k));
            lc(digits,i+1,map,ans,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    
    
    
}
