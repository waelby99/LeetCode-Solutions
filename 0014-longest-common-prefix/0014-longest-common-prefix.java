class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==1){
            return strs[0];
        }
        int min=strs[0].length();
        int index=0;
        for( int i=1;i<strs.length;i++){
            if (strs[i].length()<min){
                min=strs[i].length();
                index=i;
            }
        }
        if (min==0){
            return "";
        }
        String prefix=strs[index];
        for(int i=0;i<strs.length;i++){
            for (int j=0; j<min;j++){
                if(prefix.charAt(j)!=strs[i].charAt(j)){
                    prefix=prefix.substring(0,j);
                    min=j;
                }
            }
        }
        return   prefix;     
        }
    }
