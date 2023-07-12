import java.util.*;

public class _429_N_ary_Tree_Level_Order_Traversal {


    public static class  Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }


    public static List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> output = new LinkedList<>();

        if(root == null){
            return output;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            LinkedList<Integer> temp = new LinkedList<>();
            for(int i = 0; i < size; i++){
                Node x = queue.poll();
                temp.add(x.val);
                if(x.children != null){
                    for(Node n : x.children) {
                        queue.add(n);
                    }
                }

            }
            output.add(temp);
        }
        return output;

    }

    public static void main(String[] args) {
        LinkedList<Node> x = new LinkedList<>(Arrays.asList(new Node(3,
                        new LinkedList<Node>(Arrays.asList(new Node(5), new Node(6)))),
                new Node(2),new Node(4)));
        Node root = new Node(1, x);


        System.out.println(levelOrder(root));

    }

}
