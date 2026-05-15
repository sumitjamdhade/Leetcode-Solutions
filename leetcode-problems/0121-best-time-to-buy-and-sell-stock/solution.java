
class Solution {
    public static int maxProfit(int[] prices) {
        int currMin = prices[0];
        int res = 0;
    
        for(int i= 1; i<prices.length; i++) {
            
            currMin = Math.min(currMin, prices[i]);

            res = Math.max(res, prices[i] - currMin);
        }
        return res;
    }
}

