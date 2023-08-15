public class _135_Candy {

    public static int candy(int[] ratings){
        int n = ratings.length;
        int candy = n, i = 1;

        while(i < n){
            if(ratings[i] == ratings[i-1]){
                i++;
                continue;
            }

            int peak = 0;
            while(ratings[i] > ratings[i-1]){
                peak++;
                candy += peak;
                i++;
                if(i == n) return candy;
            }


            int valley = 0;
            while(i < n && ratings[i] < ratings[i-1]){
                valley++;
                candy += valley;
                i++;
            }
            candy -= Math.min(peak, valley);
        }
        return candy;
    }


    public static void main(String[] args) {
        System.out.println(candy(new int[]{1,0,2}));
    }
}
