class Solution {
    public int smallestIndex(int[] nums) {
        for ( int i = 0 ; i < nums.length ; i++ ){
            int sum = 0;
            int f = nums[i];
            while ( f >  0) {
                sum += (f%10);
                f = (f/10);
            }
            if ( sum == i){
                return i;
            }
        }

        return -1;
    }
}