class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0; // No profit can be made with less than 2 prices
        }

        int min_price = prices[0]; // Initialize min_price with the first day's price
        int max_profit = 0; // Initialize max_profit to 0

        for (int i = 1; i < prices.length; i++) {
            // If current price is lower than min_price found so far, update min_price
            if (prices[i] < min_price) {
                min_price = prices[i];
            } else {
                // If current price is higher, calculate potential profit
                // and update max_profit if it's greater
                max_profit = Math.max(max_profit, prices[i] - min_price);
            }
        }
        return max_profit;
    }
}