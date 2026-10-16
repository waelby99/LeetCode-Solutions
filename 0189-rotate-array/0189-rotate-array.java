class Solution {
    public void rotate(int[] nums, int k) {

       int len = nums.length;
       if ( len == 1 ) return;
       if ( k == 0) return;
       k = k % len ;
       //First we do the reverse of the array
        for (int i=0 ; i < len/2; i++ ){
            int temp = nums[i];
            nums[i] = nums[len -1 -i];
            nums[len -1 -i] = temp;
        }
        //Second we reverse array from 0 to k
        for (int i = 0 ; i < (k/2) ; i++ ){
            int temp = nums[i];
            nums[i] = nums[k -1 -i];
            nums[k -1 -i] = temp;
        }
        //Finally we reverse the array from k to len
        for (int i = k  ; i< k + (len - k) /2  ; i++){
            int temp = nums[i];
            nums[i] = nums[len-1 +k -i];
            nums[len -1 +k -i] = temp;
        }
}
}