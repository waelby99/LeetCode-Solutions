class Solution {
    public boolean canAliceWin(int n) {
        int f = 10;
        int i = 0;
        while (n > 0){
            if(f>n){
                break;
            }
            n = n-f;
            f--;
            i++;
        }
        return i%2!=0;
    }
}