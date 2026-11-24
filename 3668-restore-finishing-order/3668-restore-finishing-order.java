class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = friends.length;
        int p = order.length;
        int[] arr = new int[n];
        int k = 0; 
        for(int i = 0 ; i < p; i++){
            for(int j = 0 ; j < n ; j++){
                if(order[i] == friends[j]){
                    arr[k] = friends[j];
                    k++;
                    break;
                }
            }
        }
        return arr;
    }
}