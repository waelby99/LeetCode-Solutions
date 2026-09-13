class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums=new int[nums1.length+nums2.length];
        int t=0;
        for(int i=0;i<nums1.length;i++){
            nums[t]=nums1[i];
            t++;
        }
        for(int i=0;i<nums2.length;i++){
            nums[t]=nums2[i];
            t++;
        }
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
            int c=nums[j];
            if(nums[i]>nums[j]){
            nums[j]=nums[i];
            nums[i]=c;}
            }
        }

        double f=0;
        if ((nums.length)%2!=0){
            f = nums[nums.length/2];
        }
        else {
            f=nums[nums.length/2];
            f=(f+nums[nums.length/2 - 1])/2;
        }
        return f;
    }
}