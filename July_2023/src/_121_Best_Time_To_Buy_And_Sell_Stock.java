public class _121_Best_Time_To_Buy_And_Sell_Stock {


    public static int maxProfit(int[] prices){
        int max = 0, min = Integer.MAX_VALUE;

        for(int p : prices){
            if(p < min){
                min = p;
            }
            max = Math.max(max, p - min);
        }
        return max;

    }


    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
