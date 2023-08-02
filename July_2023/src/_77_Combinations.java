import java.util.*;

public class _77_Combinations {

    public static List<List<Integer>> combinations(int n, int k){
        List<List<Integer>> result = new ArrayList<>();
        solve(1, n, k, new ArrayList<>(), result);
        return result;

    }

    public static void solve(int num, int n, int k, List<Integer> ans, List<List<Integer>> result){
        if(ans.size() == k){
            result.add(new ArrayList<>(ans));
            return;
        }

        for(int i = num; i <= n; i++){
            ans.add(i);
            solve(i + 1, n, k, ans, result);
            ans.remove(ans.size()-1);
        }
    }


    public static void main(String[] args) {
        System.out.println(combinations(4,2));

    }
}
