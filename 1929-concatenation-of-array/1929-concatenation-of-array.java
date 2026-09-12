class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length ;
        int[] nums2 = new int[ n*2 ];
        for(int i = 0 ; i < n ; i++ ){
            nums2[ i ] = nums[ i ];
            nums2[ n + i ] = nums[ i ];
        }
        return nums2;
    }
}