class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int xor = 0;
        for ( int i = 0 ; i < nums.length ; i++ ){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer i : hm.keySet()) {
            if ( hm.get(i) == 2){
                xor ^= i;
            }
        }
        return xor;
    }   
}