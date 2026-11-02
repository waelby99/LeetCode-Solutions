class Solution {
    public int minimumOperations(int[] nums) {
        int x = 0;
        for (int num:nums) x +=  Math.min(num % 3, 3 - (num % 3));
        return x;
    }
}