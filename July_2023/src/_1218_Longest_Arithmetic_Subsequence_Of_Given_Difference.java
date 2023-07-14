import java.util.*;

public class _1218_Longest_Arithmetic_Subsequence_Of_Given_Difference {

    public static int longestSubsequence(int[] arr, int difference){
        HashMap<Integer, Integer> dp = new HashMap<>();

        int answer = 1;

        for(int a : arr){
            int beforeA = dp.getOrDefault(a-difference, 0);
            dp.put(a, beforeA + 1);
            answer = Math.max(answer, dp.get(a));
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(longestSubsequence(new int[]{1,2,3,4}, 1));
        System.out.println(longestSubsequence(new int[]{1,3,5,7}, 1));
        System.out.println(longestSubsequence(new int[]{1,5,7,8,5,3,4,2,1}, -2));

    }
}
