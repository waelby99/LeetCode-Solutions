class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            if(height[left]>height[right]){
                max=Math.max(max,height[right]*(right-left));
                right-=1;
            }
            else{
                max=Math.max(max,height[left]*(right-left));
                left+=1;
            }
        }

     return max;   
    }
}