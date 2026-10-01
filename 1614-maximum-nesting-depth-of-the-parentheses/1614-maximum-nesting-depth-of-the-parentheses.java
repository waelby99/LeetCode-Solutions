class Solution {
    public int maxDepth(String s) {
        int maxLen = 0;
        int max = 0;
        for( int i = 0 ; i < s.length() ; i++ ){
            char c = s.charAt(i);
            if ( c == '(' ){
                maxLen++ ;
            }
            if ( c == ')' ){
                maxLen--;
            }
            max = Math.max(max, maxLen);
        }
        return max;
    }
}