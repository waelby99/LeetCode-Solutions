class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int x:arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i:hm.values()){
            if(hs.contains(i)){
                return false;
            }
            else{
                hs.add(i);
            }
        }
        return true;
    }
}