class Solution {
    public void reverseString(char[] s) {
        
        int j=0;
        
        for(int i=s.length-1; i>=0;i--){
            if(i>j){
            char c=s[j];
            s[j]=s[i];
            s[i]=c;
            j++;}
        }
       
    }
}