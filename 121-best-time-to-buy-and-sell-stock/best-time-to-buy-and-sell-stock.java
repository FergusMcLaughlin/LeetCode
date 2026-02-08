class Solution {
    public int maxProfit(int[] prices) {
        int buy = 100000000;
        int currentBestProfit = 0;

        for(int i = 0; i < prices.length; i++){
            //if not lets sell if the profit is better

            if(prices[i] < buy) {
                buy = prices[i];
                System.out.println("buy changed to : " + buy);
            } else if (prices[i] - buy > currentBestProfit){
                currentBestProfit = prices[i] - buy;
                System.out.println("prof changed to : " + currentBestProfit);
            }
        }
        return currentBestProfit;
    }
}