class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length, sum = 0;
        if ( n == 1 ) return 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i < n ; i++ ){
            min = Math.min(min, nums[i]);
        }
        for (int i = 0 ; i < n ; i++ ){
           
            sum += ( nums[i] - min) ;
            
        }
        return sum;
    }
}