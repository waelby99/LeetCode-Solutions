class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
    
        int index = arr.length - 1, number = arr.length - 2;
        while( index - 2 >= 0){
            if( arr[index] - arr[index - 1] == arr[index -1] - arr[index - 2] ){
                number--;
            }
            index--;
        }

        return number == 0;
    }
}