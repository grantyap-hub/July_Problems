public class _274_H_Index {

    public static int hIndex(int[] c){
        int low = 0, high = c.length;

        while(low < high){
            int mid = low + (high-low)/2;

            if(canMake(c, mid))
                low = mid;
            else
                high = mid - 1;
        }
        return low;
    }

    public static boolean canMake(int[] c, int val){
        int cnt = 0;
        for(int i = 0; i < c.length; i++){
            if(c[i]>= val)
                cnt++;
        }
        return cnt >= val;
    }


    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{3,0,6,1,5}));
    }
}
