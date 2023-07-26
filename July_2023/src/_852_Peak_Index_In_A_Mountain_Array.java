public class _852_Peak_Index_In_A_Mountain_Array {


    public static int peakIndexInMountainArray(int[] arr){
        int left = 0, right = arr.length-1;

        while(left < right){
            int mid = left + (right-left)/2;

            if(mid + 1 < arr.length && arr[mid] > arr[mid+1]){
                right = mid;
            } else{
                left = mid + 1;
            }
        }
        return left;
    }


    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{0,2,1,0}));

    }
}
