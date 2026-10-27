class Solution {
    public int digitFrequencyScore(int n) {
        int sum = 0;
        while(n > 0){
            int q = n % 10 ;
            sum += q;
            n = n / 10;
        }

        return sum;
    }
}