class Solution {
    public int maxProfit(int[] prices) {
        
        int buy = 1000000;
        int sell = 0;
        int bestProfit = 0;


        for(int i = 0; i < prices.length; i++){
            if(buy > prices[i]){
                buy = prices[i];
            } else if (prices[i] - buy > bestProfit) {
                bestProfit = prices[i] - buy;
            }
        }
        return bestProfit;
    }
}