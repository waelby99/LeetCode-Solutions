class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> s = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            int reversed=0;
                s.add(nums[i]);
            while(nums[i] != 0){
                int y=nums[i]%10;
                nums[i]=nums[i]/10;
                reversed=y+reversed*10;
            }
                s.add(reversed);
        }
        return s.size();
        
    }
}