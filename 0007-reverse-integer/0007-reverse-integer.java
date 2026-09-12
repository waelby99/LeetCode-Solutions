class Solution {
    public int reverse(int x) {
        int reversed=0;
        while(x != 0){
            int y=x%10;
            x=x/10;
             if (reversed> 2147483647/10 || reversed<-2147483648/10){
                return 0;
            }
            reversed=y+reversed*10;
        }
        return reversed;
    }
}