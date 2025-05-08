class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(buy<prices[i]){
                int Profit = prices[i]-buy;
                maxProfit = Math.max(maxProfit,Profit);
            }else{
                buy = prices[i];
            }
        }
        return maxProfit;
    }
}