class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int buy = prices[0];
        int i=0;
        while(i < n-1) {
            if(prices[i] > prices[i+1]){
                profit += prices[i] - buy;
                buy = prices[i+1];
            }
            i++;
        }
        if(buy < prices[n-1]) profit += prices[n-1] - buy;
        return profit;
    }
}