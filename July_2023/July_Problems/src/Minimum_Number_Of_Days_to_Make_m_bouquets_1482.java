public class Minimum_Number_Of_Days_to_Make_m_bouquets_1482 {


    public static int minDays(int[] bloomDay, int m, int k){
        if(bloomDay.length < m * k){
            return -1;
        }
        int left = 1, right = 1;

        for(int i : bloomDay){
            left = Math.min(left, i);
            right = Math.max(right, i);
        }

        while(left < right){
            int mid = left + (right-left)/2;

            if(canmake(mid, m, k, bloomDay)){
                right = mid;
            } else{
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean canmake(int val, int bouquet, int flowers, int[] bloom){
        int count = 0;
        for(int i : bloom){
            if(i <= val){
                count++;
                if(count == flowers) {
                    bouquet--;
                    count = 0;
                    if (bouquet == 0) {
                        return true;
                    }
                }
            } else{
                count = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(minDays(new int[]{1,10,3,10,2}, 3, 1));
        System.out.println(minDays(new int[]{1,10,3,10,2}, 3, 2));
        System.out.println(minDays(new int[]{7,7,7,7,12,7,7}, 2, 3));

    }
}
