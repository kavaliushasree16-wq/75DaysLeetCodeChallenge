class Solution {
    public int maxProfit(int[] prices) {
        int costPrice=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>costPrice){
                int temp=prices[i]-costPrice;
                profit=Math.max(profit,temp);
            }else{
                costPrice=prices[i];
            }
        }
        return profit;
    }
}