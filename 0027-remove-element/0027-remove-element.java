class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int index = 0;
        int len = nums.length;
        for (int i =0 ; i < len; i++ ){
            if (nums[i]!=val){
                nums[index]= nums[i];
                count++;
                index ++;
            }
        }

        return count;
    }
}