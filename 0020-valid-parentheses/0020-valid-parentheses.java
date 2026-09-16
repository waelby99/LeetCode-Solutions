class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
           if (!st.isEmpty()) {
                if (s.charAt(i) == ')' && st.peek() != ')') {
                    return false;
                }
                else if (s.charAt(i) == ']' && st.peek() != ']') {
                    return false;
                }
                else if (s.charAt(i) == '}' && st.peek() != '}') {
                    return false;
                }
            }
            if (st.isEmpty()){
                if (s.charAt(i) == ')') {
                    return false;
                }
                else if (s.charAt(i) == ']') {
                    return false;
                }
                else if (s.charAt(i) == '}') {
                    return false;
                }
            }    


            if (s.charAt(i)=='('){
                st.push(')');
            }
            if(s.charAt(i)=='{'){
                st.push('}');
            }
            if(s.charAt(i)=='['){
                st.push(']');
            }
            
            if (st.peek()==s.charAt(i)){
                st.pop();
            }
               
        }
        
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}