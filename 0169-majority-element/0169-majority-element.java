class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if (hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
                
            }
            else{
                hm.put(nums[i],1);
            }
        }
        int highest=(Collections.max(hm.values()));
        for (Map.Entry<Integer,Integer> number:hm.entrySet()) {
            if(number.getValue() == highest){
                return number.getKey();
            }
        }
        return 0;
    }
}


/**/