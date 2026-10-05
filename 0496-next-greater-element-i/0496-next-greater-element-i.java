class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        
        for( int i = 0 ; i < nums1.length ; i++ ){
            int number = nums1[i] ;
            int k = 0 ;
            for ( int j = 0 ; j < nums2.length ; j++ ){
                if ( nums2[j] == number ){
                    k = j;
                    break;
                }
            }
            result[i] = -1;
            for ( int f = k ; f < nums2.length ; f++ ){
                if ( nums2[f] > number ){
                    result[i] = nums2[f];
                    break;
                }
            }
        }
        return result;
    }
}