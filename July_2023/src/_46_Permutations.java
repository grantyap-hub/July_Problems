import java.util.*;
public class _46_Permutations {

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        permuteRec(nums, 0, result);
        return result;
    }

    public static void permuteRec(int[] nums, int begin, List<List<Integer>> result){
        if(begin == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int num : nums) temp.add(num);
            result.add(temp);
            return;
        }

        for(int i = begin; i < nums.length; i++){
            int temp = nums[begin];
            nums[begin] = nums[i];
            nums[i] = temp;

            permuteRec(nums, begin + 1, result);

            temp = nums[begin];
            nums[begin] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));

    }
}
