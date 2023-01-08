//link https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
class Solution {
    public int maxProfit(int[] prices) {
        var profit = 0;
        var lowPrice = prices[0];
        for (int i = 0; i < prices.length-1; i ++) {
            if (prices[i+1] - lowPrice > profit) {
                profit = prices[i+1] - lowPrice;
            } else if (lowPrice > prices[i+1]){
                lowPrice = prices[i+1];
            }
        }
        return profit;
    }
}
