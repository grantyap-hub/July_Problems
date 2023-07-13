import java.util.*;
public class _802_Find_Eventual_Safe_States {

    public static List<Integer> eventualSafeNodes(int[][] graph){
        int n = graph.length;
        boolean[] visit = new boolean[n];
        boolean[] inStack = new boolean[n];

        for(int i = 0; i < n; i++){
            dfs(i, graph, visit, inStack);
        }

        List<Integer> safeNodes = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(!inStack[i]){
                safeNodes.add(i);
            }
        }
        return safeNodes;
    }

    public static boolean dfs(int node, int[][] graph, boolean[] visit, boolean[] inStack){
        if(inStack[node]){
            return true;
        }

        if(visit[node]){
            return false;
        }

        visit[node] = true;
        inStack[node] = true;
        for(int neighbor : graph[node]){
            if(dfs(neighbor, graph, visit, inStack)){
                return true;
            }
        }
        inStack[node] = false;
        return false;
    }


    public static void main(String[] args) {
        System.out.println(eventualSafeNodes(new int[][]{{1,2},{2,3},{5},{0},{5},{},{},}));
        System.out.println(eventualSafeNodes(new int[][]{{1,2,3,4},{1,2},{3,4},{0,4},{}}));

    }
}
