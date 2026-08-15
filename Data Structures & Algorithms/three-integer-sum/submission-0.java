class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // brute force
    //     int n = nums.length;
    //     List<List<Integer>> ans = new ArrayList<>();
    //    for(int i=0;i<n;i++){
    //     for(int j=i+1;j<n;j++){
    //         for(int k=j+1;k<n;k++){
    //             if(nums[i]+nums[j]+nums[k]==0){
    //                List<Integer> temp = new ArrayList<>();
    //                temp.add(nums[i]);
    //                temp.add(nums[j]);
    //                temp.add(nums[k]);
    //                ans.add(temp);
    //             }
                
    //         }
    //     }
    //    } 
    //    return ans;

    //Better Using Set
    int n = nums.length;
    List<List<Integer>> res = new ArrayList<>();
    Set<List<Integer>> set = new HashSet<>();
    for(int i=0;i<n;i++){
        int target = -nums[i];
        Set<Integer> s = new HashSet<>();
        for(int j=i+1;j<n;j++){
            int third = target-nums[j];
            if(s.contains(third)){
                List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
                Collections.sort(temp);
                set.add(temp);
            }
            s.add(nums[j]);
        }
    }
    res.addAll(set);
    return res;
    }
}
