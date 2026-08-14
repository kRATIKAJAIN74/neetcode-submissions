class Solution {
    public int maxProfit(int[] prices) {
        int p = prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++){
             int cost  = prices[i] - p;
  profit = Math.max(profit,cost);
  p = Math.min(p,prices[i]);
        }
        return profit;
    }
}
