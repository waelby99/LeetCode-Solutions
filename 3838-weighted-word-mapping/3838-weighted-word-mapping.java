class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
     StringBuilder sb = new StringBuilder();
     for ( int i = 0 ; i < words.length ; i++ ){
        int sum = 0;
        for ( int j = 0 ; j < words[i].length() ; j++ ){
            sum += weights[(int)words[i].charAt(j) - 97];
        }
        sum = sum % 26;
        sb.append((char)(Math.abs(sum-122)));
     }
    return sb.toString();
    }
}