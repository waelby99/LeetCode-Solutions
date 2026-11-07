class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // List<Integer> before = new ArrayList<>();
        // List<Integer> after = new ArrayList<>();
        // int equals=0;
        // int j =0;
        // for(int i:nums ){
        //     if (i < pivot ){
        //         before.add(i);
        //     }
        //     else if (i > pivot){
        //         after.add(i);
        //     }
        //     else if (i == pivot){
        //         equals++;
        //     }
        // }
        // for (j= 0 ; j < before.size() ; j++){
        //     nums[j] = before.get(j);
        // }
        
        // System.out.println(j);
        // System.out.println(equals);
        // for(int i = 1 ; i <= equals ; i++){
        //     nums[j] = pivot;
        //     j++;
        // }
        // int k = 0;
        // for(int i = j ; i < j + after.size() ; i++){

        //     nums[i] = after.get(k);
        //     k++;
        // }

        // return nums;

        int[] ans = new int[nums.length];
        int index = 0;
        
        for (int i:nums){
            if( i < pivot ){
                ans[index] = i;
                index++ ;
            }
        }

        for (int i:nums){
            if( i == pivot ){
                ans[index] = i;
                index++ ;
            }
        }

        for (int i:nums){
            if( i > pivot ){
                ans[index] = i;
                index++ ;
            }
        }

        return ans;

    }
}