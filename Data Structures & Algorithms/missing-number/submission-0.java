class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actual = 0;
        for(int i=0;i<n;i++){
           actual += nums[i];
        }
        int total = n*(n+1)/2;
        return total-actual;
    }
}
