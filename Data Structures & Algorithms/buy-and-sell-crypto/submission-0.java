class Solution {
    public int maxProfit(int[] prices) {
        int lowPrice=prices[0];
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<lowPrice){
                lowPrice=prices[i];
            }
            if(prices[i]-lowPrice>maxProfit){
                maxProfit=prices[i]-lowPrice;
            }
        }
        return maxProfit;
    }
}
