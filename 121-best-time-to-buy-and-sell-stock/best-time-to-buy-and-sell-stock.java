class Solution {
    public int maxProfit(int[] prices) {
        int buy = 10000;
        int priceToday = 0;
        int bestPrice = 0;

        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < buy){
                buy = prices[i];
            } else {
                priceToday = prices[i] - buy;
                if(priceToday > bestPrice)
                bestPrice = priceToday;
            }
        }
    return bestPrice;
    }
}