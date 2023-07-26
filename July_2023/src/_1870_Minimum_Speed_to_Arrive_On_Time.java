public class _1870_Minimum_Speed_to_Arrive_On_Time {


    public static int minSpeedOnTime(int[] dist, double hour){
        int left = 1, right = 10000000, ans = -1;

        while(left <= right){
            int mid = left + (right-left)/2;


            if(canmake(mid, dist, hour)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }

    public static boolean canmake(int val, int[] dist, double hour){
        double sum = 0;
        for(int i = 0; i < dist.length; i++){
            double temp = dist[i]*1.0/val;
            if(i!=dist.length-1)
                sum += Math.ceil(temp);
            else
                sum += temp;
        }
        return sum <= hour;
    }

    public static void main(String[] args) {
        System.out.println(minSpeedOnTime(new int[]{1,3,2}, 6));

    }
}
