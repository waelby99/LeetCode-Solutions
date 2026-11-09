class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // int left = 0, right = letters.length-1 ;

        // while ( left <= right ){
        //     int mid = left + ( right - left ) / 2;
            
        //     if ( letters [mid] == target ){
        //         return letters[mid + 1];
        //     }
        //     if (letters[mid] < target) {
        //         left = mid + 1; 
        //     } else {
        //         right = mid - 1; 
        //     }

        // }
        // return letters[0];

        for (int i = 0 ; i < letters.length ; i++ )
        {
            if ( (letters[i] == target) && (i != letters.length-1)  &&  (letters[i+1]  != target ) ){
                return letters[i+1];
            }
            
            if((i != letters.length-1)){
            if  ((letters[i] < target) && (letters[i+1] > target )  )  {
                return letters[i+1];
            }
            }
        }
        return letters[0];      
    }
}