class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         HashSet<Integer> al = new HashSet<>();
        for( int i = 0 ; i < nums1.length ; i++ ){
            for( int j = 0 ; j < nums2.length ; j++ ){
                if ( nums1[i] == nums2[j] ){
                    al.add(nums2[j]);
                    nums2[j] = -1;
                    break;
                }
            }
            
        }
        int[] result = new int[al.size()];
        int i = 0;
        for(Integer x:al){
            result[i] = x;
            i++;
        }
        return result;
    }
}