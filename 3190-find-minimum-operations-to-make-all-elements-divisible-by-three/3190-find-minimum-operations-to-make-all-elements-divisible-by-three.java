class Solution {
    public int minimumOperations(int[] nums) {
        int x = 0;

        for (int num:nums){
            if (num % 3 !=0){
                x +=  Math.min(num % 3, 3 - (num % 3));
            }
        } 
        return x;
    }
}