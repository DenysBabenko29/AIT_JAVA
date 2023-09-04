public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }
    public static int maxProfit(int[] prices) {
        int minValue = prices[0];
        int profit = 0;
        int res = 0;
        for(int i = 0; i < prices.length; i++){
            if(minValue > prices[i]){
                minValue = prices[i];
            }
            profit = prices[i] - minValue;
            if(res < profit){
                res = profit;
            }
        }
        return res;
    }
}
