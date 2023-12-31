import java.util.*;
public class _189_Rotate_Array {


    public static void rotate(int[] nums, int k){
        int n = nums.length;
        k %= n;


        reverseArray(nums, 0, n - k - 1);
        reverseArray(nums, n - k, n - 1);
        reverseArray(nums, 0, n - 1);
    }

    public static void reverseArray(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int[] xd = {1,2,3,4,5,6,7};
        rotate(xd, 8);
        System.out.println(Arrays.toString(xd));
    }
}
