class Solution {
    public boolean isIsomorphic(String s, String t) {
       if(s.length()!=t.length()){
        return false;
       } 
     HashMap<Character,Character> hm=new HashMap<>();
     for(int i=0;i<s.length();i++){
        char f=s.charAt(i);
        char se=t.charAt(i);
        if(!hm.containsKey(f)){
            if(!hm.containsValue(se)){
                hm.put(f,se);
            }
            else{
            return false;
            }
        }
        else{
            char m=hm.get(f);
            if(m!=se){
                return false;
            }
        }
       
     }
      return true;

    }
}