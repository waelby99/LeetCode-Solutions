class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // using the 2 pointer technique not that stupid O(n²) solution
        int left = 0 , right = numbers.length - 1;
        while ( left < right ){
            if ( numbers[left] + numbers[right] > target){
                right--;
            }
            else if ( numbers[left] + numbers[right] < target){
                left++;
            }
            else if ( numbers[left] + numbers[right] == target){
               break;
            }
        }
        return new int[]{ left + 1 , right + 1};
    }
}