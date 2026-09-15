class Solution {
    public int lengthOfLongestSubstring(String s) {
      ArrayList<Character> al= new ArrayList<>();
      int biggest=0;
      
      for(int i=0;i<s.length();i++){
            if(al.contains(s.charAt(i))){
                if(al.size()>biggest){
                    biggest=al.size();
                }
                while(al.contains(s.charAt(i))){
                    al.remove(0);
                }
                al.add(s.charAt(i));
            }
            else{
                al.add(s.charAt(i));
                if(al.size()>biggest){
                    biggest=al.size();
                }
            }
      }

      return biggest;
    }
}
