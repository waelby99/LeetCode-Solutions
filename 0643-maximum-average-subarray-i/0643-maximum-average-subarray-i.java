class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double res = Double.NEGATIVE_INFINITY ;
        int n = nums.length; 
        for(int i = 0 ; i <= n - k ; i++ ){
            int moy = 0 ;
            for(int j = 0 ; j < k; j++ ){
                moy += nums[i+j];
            }
            double f = (double) moy/k;
            res = Math.max(res,f);
        }

        return res;
    }
}