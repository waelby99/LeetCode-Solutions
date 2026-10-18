class Solution {
    public int firstUniqChar(String s) {
        int[] numbers = new int[26]; 
        for(int i=0;i<s.length();i++){
            numbers[(int)s.charAt(i)-97]++;
        }
        ArrayList<Character> f = new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==1){
                f.add((char)(i+97));
            }
        }
        for(int i=0;i<s.length();i++){
            if(f.contains(s.charAt(i))){
                return i;
            }
        }    
        return -1;
    }
}

 /*for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=0;j<s.length();j++){
            if (s.charAt(i)==s.charAt(j))
                count++;
            }
            if (count==1){
                return i;
            }           
        } */