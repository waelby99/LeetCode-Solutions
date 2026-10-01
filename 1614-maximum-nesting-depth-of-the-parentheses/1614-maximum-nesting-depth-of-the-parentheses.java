class Solution {
    public int maxDepth(String s) {
        Deque <Character> stack = new ArrayDeque<>();
        int maxLen = 0;
        int max = 0;
        for( int i = 0 ; i < s.length() ; i++ ){
            char c = s.charAt(i);
            if ( c == '(' ){
                stack.push(c);
                maxLen++ ;
            }
            else if ( c == ')' && !stack.isEmpty() ){
                maxLen--;
            }
            max = Math.max(max, maxLen);
        }
        return max;
    }
}