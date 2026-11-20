class Solution {
    public int mirrorDistance(int n) {
        int rev = 0;
        int a = n;
        while (a > 0 ){
            int res = a%10 ; 
            rev = rev * 10 + res ;
            a = a/10;
        }
        return Math.abs(n - rev);
    }
}