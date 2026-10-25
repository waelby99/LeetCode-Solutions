class Solution {
    public int compress(char[] chars) {
        int len = chars.length;

        int left = 0, right = 1;
        int count = 1;
        int i = 0;

        while (right <= len) {

            if (right < len && chars[left] == chars[right]) {
                count++;
            } else {
                chars[i] = chars[left];
                i++;

                if (count > 1) {
                    int divisor = 1;

                    while (count / divisor >= 10) {
                        divisor *= 10;
                    }

                    while (divisor > 0) {
                        chars[i] = (char) ('0' + (count / divisor) % 10);
                        i++;
                        divisor /= 10;
                    }
                }

                left = right;
                count = 1;
            }

            right++;
        }

        return i;
    }
}