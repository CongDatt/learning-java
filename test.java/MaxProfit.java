public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int L = 0;
        int R = 1;
        int maxProfit = 0;

        while(R < prices.length) {
            System.out.println("R: " + R);
            System.out.println("R price: " + prices[R]);
            System.out.println("L : " + L);
            System.out.println("L price : " + prices[L]);
            if(prices[R] > prices[L]) {
                int profit = prices[R] - prices[L];
                System.out.println("profit :" +profit);
                System.out.println("Profit: "+ profit);
                maxProfit = Math.max(maxProfit, profit);
                System.out.println("Max profit: " + maxProfit);
            }
            else {
                L = R;
            }
            R += 1;
            System.out.println("==============================");
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        int[] prices = { 7,1,5,3,6,4 };
        System.out.println(maxProfit(prices));
    }

}
