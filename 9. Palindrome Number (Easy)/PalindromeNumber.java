class Solution {
    public boolean isPalindrome(int x) {
      /*String str = String.valueOf(x);
      String strInv = new StringBuilder(str).reverse().toString(); 
              if (str.equals(strInv))
              return true;
              else return false;*/

    String str= String.valueOf(x);
    for(int i=0; i<str.length();i++){
        if (str.charAt(i) != str.charAt(str.length() - 1 - i))
        {
            return false;
        }
        
    }
    return true;  
}
}