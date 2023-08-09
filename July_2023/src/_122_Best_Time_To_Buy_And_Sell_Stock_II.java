public class _122_Best_Time_To_Buy_And_Sell_Stock_II {

    public static int maxProfit(int[] prices){
        int profit = 0;
        int stockOnHand = prices[0];
        for(int price : prices){
            if(price > stockOnHand){
                profit += price-stockOnHand;
            }
            stockOnHand = price;
        }
        return profit;
    }


    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));

    }
}
