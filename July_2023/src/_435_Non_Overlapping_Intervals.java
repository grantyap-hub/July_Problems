import java.util.*;

public class _435_Non_Overlapping_Intervals {

    public static int eraseOverlapIntervals(int[][] intervals){
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));
        int answer = 0;
        int last = Integer.MIN_VALUE;
        for(int[] i : intervals){
            if(i[0] < last){
                answer++;
            } else{
                last = i[1];
            }
        }
        return answer;
    }

    public static int dp(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        int n = intervals.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                if (intervals[j][1] <= intervals[i][0]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return n - Arrays.stream(dp).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(eraseOverlapIntervals(new int[][]{{1,2},{2,3},{3,4},{1,3}}));
        System.out.println(dp(new int[][]{{1,2},{2,3},{3,4},{1,3}}));


    }
}
