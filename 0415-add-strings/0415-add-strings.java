class Solution {
    public String addStrings(String num1, String num2) {
        int rest=0;
        int n= Math.max(num1.length(), num2.length());
        char[] res=new char[n];
        
        int i=num1.length()-1;
        int j=num2.length()-1;
        int k=n-1;
        while(i>=0 && j>=0){
           int f =(num1.charAt(i)-'0')+(num2.charAt(j)-'0');
            f += rest;
            res[k]=(char)((f%10)+'0');
            rest = f/10;

            k--;
            i--;
            j--;
        }
        if(i<0 && j>=0){
            while(j>=0){
            int p=num2.charAt(j)-'0';
            p += rest;
            res[k]=(char)((p%10)+'0');
            rest = p / 10;
            k--;
            j--;
            }
        }
        if(i>=0 && j<0){
            while(i>=0){
            int p=num1.charAt(i)-'0';
            p += rest;
            res[k]=(char)((p%10)+'0');
            rest = p / 10;
            k--;
            i--;
            }
        }
       String f=new String(res); 
       if(rest!=0){
        return ((char)(rest+'0'))+f;
       }
        return f;
    }
}