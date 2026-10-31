class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        boolean[] s = new boolean[len + 1];

        for (int i = 0; i < len; i++) {
            if (nums[i] > 0 && nums[i] <= len) {
                s[nums[i]] = true;
            }
        }
        int nonexistant = len + 1;
        for (int i = 1 ; i < len + 1; i++){
            if (s[i] == false){
                nonexistant = i;
                break;
            }
        }
        

        return nonexistant;
    }
}
