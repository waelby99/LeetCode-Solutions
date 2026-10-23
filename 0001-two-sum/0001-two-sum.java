class Solution {
    public int[] twoSum(int[] nums, int target) {
//         for (int i=0;i<nums.length;i++){ 
//             for (int j=i+1;j<nums.length;j++){
//                 if (nums[i]+nums[j]==target)
//                 return new int[]{i,j};
//             }
// }
// return null;

 HashMap<Integer,Integer> hm = new HashMap<>();
        int index1 = -1;
        int index2 = -1;
        for (int i =0;i<nums.length;i++){
            if ( (!hm.isEmpty() ) && (hm.containsKey(target-nums[i]))){
                index1 = hm.get(target-nums[i]);
                index2 = i;
            }
            else {
                hm.put(nums[i],i);
            }
        }
        return new int[]{index1,index2};

    }
}

