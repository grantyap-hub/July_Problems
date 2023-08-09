import java.util.*;
public class _45_Jump_Game_II {

    public static int jump(int[] nums){
        for(int i = 1; i < nums.length; i++){
            nums[i] = Math.max(nums[i] + i, nums[i-1]);
        }

        int ind = 0, ans = 0;

        while(ind < nums.length-1){
            ans++;
            ind = nums[ind];
        }
        return ans;
    }

    public static int altJump(int[] nums){
        int[] table = new int[nums.length];
        Arrays.fill(table, 10000);
        table[0] = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j <= nums[i]; j++){
                if(i + j < nums.length){
                    table[i+j] = Math.min(table[i+j],table[i] + 1);
                }
            }
        }
        return table[nums.length-1];
    }


    public static void main(String[] args) {
        System.out.println(altJump(new int[]{2,3,1,1,4}));
    }
}
