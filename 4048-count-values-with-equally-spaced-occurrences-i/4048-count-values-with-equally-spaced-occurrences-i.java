class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap< Integer, Integer > hm = new HashMap<>();
        int count = 0;
        for ( int i = 0 ; i < nums.length ; i++ ){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        hm.entrySet().removeIf( entry -> entry.getValue() != 3);
        for ( Integer i : hm.keySet()){
            ArrayList<Integer> al = new ArrayList<>();
            for (int j = 0 ; j < nums.length ; j ++){
                if ( i == nums[j] ){
                    al.add(j);
                }
            }
            if ( al.get(2) - al.get(1) == al.get(1) - al.get(0)){
                count++;
            }
            
        }
        
        return count;
    }
}