class Solution {
    public int maxProfit(int[] prices) {
        int buy = 100000000;
        int currentBestProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > currentBestProfit){
                currentBestProfit = prices[i] - buy;
            }
        }
        return currentBestProfit;
    }
}