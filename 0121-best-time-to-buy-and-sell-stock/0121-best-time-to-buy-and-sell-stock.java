class Solution {
    public int maxProfit(int[] prices) {
        int cp = prices[0];
        int p = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > cp) {
                int temp = prices[i] - cp;
                p = Math.max(temp, p);
            } else {
                cp = prices[i];
            }
        }
return p;
    }
}