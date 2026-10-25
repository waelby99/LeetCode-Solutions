class Solution {
    public boolean increasingTriplet(int[] nums) {
        int len = nums.length;
        if ( len == 1 ) return false;
        if ( len == 2 ) return false;
        
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0 ; i < len ; i++ ){
            if (nums[i] <= first){
                first = nums[i];
            }
            else if (nums[i] <= second){
                second = nums[i];
            }
            else {
                return true;
            }
        }

        return false;
    }
}