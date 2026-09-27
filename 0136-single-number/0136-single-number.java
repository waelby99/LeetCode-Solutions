class Solution {
    public int singleNumber(int[] nums) {
       HashSet<Integer> dd=new HashSet<>();
       for(int i=0;i<nums.length;i++){
        if(dd.contains(nums[i])){
            dd.remove(nums[i]);
        }
        else{
            dd.add(nums[i]);
        }
       }
       int x=0;
       for(int i:dd){
        x=i;
       }
    return x;
    }
}