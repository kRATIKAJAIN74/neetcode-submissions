class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       List<Integer> buck[] = new List[nums.length+1];
       HashMap<Integer,Integer> mp = new HashMap<>();
       for(int num : nums){
        mp.put(num,mp.getOrDefault(num,0)+1);
       } 
       for(int key : mp.keySet()){
        int freq = mp.get(key);
        if(buck[freq]==null){
            buck[freq] = new ArrayList<>();
        }
        buck[freq].add(key);
       }
       int[] res = new int[k];
       int counter = 0;
       for(int i=buck.length-1;i>=0 && counter<k;i--){
        if(buck[i]!=null){
            for(int m : buck[i]){
                res[counter++] = m;
            }
        }
       }
       return res;
    }
}
