class Solution {
    public int findCenter(int[][] edges) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        for (int i = 0 ; i < edges.length ; i++){
            for(int j = 0 ; j < edges[i].length; j++){
                hm.put(edges[i][j] , hm.getOrDefault(edges[i][j], 0)+1);
            }
        }

        return Collections.max(hm.entrySet(), Map.Entry.comparingByValue()).getKey(); 
    }
}