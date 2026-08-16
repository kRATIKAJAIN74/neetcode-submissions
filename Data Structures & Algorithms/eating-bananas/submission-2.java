class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int l = 1, high = 0;
       for(int pile : piles){
        high = Math.max(high,pile);
       } 
       int ans = high;
       while(l<=high){
       int mid = l + (high - l) / 2;
        long hours = 0;
  for(int pile : piles){
    hours += (pile+mid-1)/mid;
  }
  if(hours<=h){
    ans = mid;
    high = mid-1;
  } else {
    l = mid+1;
  }
       }
       return ans;
    }
}
