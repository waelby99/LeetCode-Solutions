class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length, sumL = 0 , sumR = 0;
        int[] leftSum = new int[len];
        int[] rightSum = new int[len];

        for (int i = 0 ; i < len ; i++ ){
            leftSum[i] = sumL;
            sumL += nums[i];
        }
        for (int i = len - 1 ; i >= 0 ; i-- ){
            rightSum[i] = sumR;
            sumR += nums[i];
        }
        for (int i = 0 ; i < len ; i++ ){
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
    return nums;
    }
}