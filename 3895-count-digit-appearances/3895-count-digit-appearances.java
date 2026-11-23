class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans = 0 ;
        for(int i:nums){
            while(i>0){
                int p = i % 10;
                i /= 10;
                if( p == digit){
                    ans++;
                }
            }
        }
        return ans;
    }
}