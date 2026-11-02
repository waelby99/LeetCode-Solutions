class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, sum = 0;
        double f=0;
        if ((n)%2!=0){
            f = nums[n/2];
        }
        else {
            f=nums[n/2];
            f=(f+nums[n/2 - 1])/2;
        }
        f = Math.round(f);
        for (int i =0 ; i < n ; i++ ){
            sum += Math.abs(f - nums[i]);
        }
        
        return sum;
    }
}