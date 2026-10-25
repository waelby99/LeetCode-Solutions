class Solution {
    public int compress(char[] chars) {
        int len = chars.length ;
        if ( len == 1 ) return 1;
        StringBuilder sb = new StringBuilder();
        int left = 0 , right = 1 ;
        int count = 1;
        while (right < len ){
            if ( chars[left] == chars[right] ){
                count++;
            }
            else {
                sb.append(chars[left]);
                if (count > 1) {
                    sb.append(count);
                }
                left = right;
                count = 1;
            }
            right++;
        }
        sb.append(chars[left]);
        if (count > 1) {
            sb.append(count);
        }        
        int res = sb.length();
        for (int i = 0 ; i < res ; i++ ){
            chars[i] = sb.charAt(i);
        }

        return res;
    }
}