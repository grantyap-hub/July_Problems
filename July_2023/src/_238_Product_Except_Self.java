import java.util.*;
public class _238_Product_Except_Self {

    public static int[] productExceptSelf(int[] nums){
        int[] answer = new int[nums.length];
        answer[0] = 1;

        for(int i = 1; i < nums.length; i++){
            answer[i] = nums[i-1]*answer[i-1];
        }

        int suffix = 1;
        for(int i = nums.length-1; i >= 0; i--){
            answer[i] *= suffix;
            suffix *= nums[i];
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }
}
