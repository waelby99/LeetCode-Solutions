class Solution {
    public int minMoves(int[] nums) {
        int max = 0, x  = 0;
        for( int n:nums ) max = Math.max(max,n);
        for( int n:nums ) x += (max-n);

        return x;
    }
}