class Solution {
    public int[] sumZero(int n) {
        if ( n == 1 ) return new int[]{0};
        int[] result = new int[n];
        int k = 1;
        if ( n % 2 != 0 ){
            result[0] = 0;
            for ( int i =1 ; i < n ; i+=2 ){
                    result[i] = k;
                    result[i+1] = -k;
                    k++;
            }
        }
        if ( n % 2 == 0){
           for ( int i =0 ; i < n ; i+=2 ){
                    result[i] = k;
                    result[i+1] = -k;
                    k++;
            } 
        }
        return result;
    }
}