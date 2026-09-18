class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        
        String[] words = s.trim().split("\\s+");

        for( int i = 0 ; i < words.length  ; i++ ){
            char[] chars = words[i].toCharArray();
            
            for ( int j = 0 ; j < chars.length/2 ; j++ ){
                char tmp = chars[j];
                chars[j] = chars[chars.length-1-j];
                chars[chars.length-1-j] = tmp;
            }

            String word = new String(chars);

            sb.append(word);

            if ( i != words.length - 1){
                sb.append(" ");
            }
        }


        return sb.toString();
    }
}