public class Maximum_Number_of_Achievable_Transfer_Requests_1601 {

    public static int maximumRequests(int n, int[][] requests){
        int[] indegree = new int[n];
        return helper(0, requests, indegree, n, 0);
    }

    public static int helper(int start, int[][] requests, int[] indegree, int n, int count){
        if(start == requests.length){
            for(int i = 0; i < n; i++){
                if(indegree[i] != 0){
                    return 0;
                }
            }
            return count;
        }

        indegree[requests[start][0]]--;
        indegree[requests[start][1]]++;
        int take = helper(start+1, requests, indegree, n, count + 1);

        indegree[requests[start][0]]++;
        indegree[requests[start][1]]--;
        int notTake = helper(start + 1, requests, indegree, n, count);

        return Math.max(take, notTake);
    }




    public static void main(String[] args) {

        System.out.println(maximumRequests(5, new int[][]{{0,1}, {1,0}, {0,1}, {1,2}, {2,0}, {3,4}}));
        System.out.println(maximumRequests(3, new int[][]{{0,0}, {1,2}, {2,1}}));
        System.out.println(maximumRequests(5, new int[][]{{0,3}, {3,1}, {1,2}, {2,0}}));

    }
}
