class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j = i+1;j<nums.length;j++){
        //         if(nums[i] + nums[j]==target) {
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};
        HashMap<Integer,Integer> mp  = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x = target - nums[i];
            if(mp.containsKey(x)) return new int[]{mp.get(x),i};
            mp.put(nums[i],i);
        }
        return new int[]{};
    }
}
