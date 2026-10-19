class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++ ){
            for (int j=i+1;j<nums.length;j++){
            int c=nums[j];
            if(nums[i]>nums[j]){
            nums[j]=nums[i];
            nums[i]=c;}
            }
        }
        for(int i=0;i<nums.length;i++){
            if (nums[i]==target){
                al.add(i);
            }
        }

    return al;
    }
}