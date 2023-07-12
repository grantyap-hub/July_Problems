import java.util.*;

public class _111_Minimum_Depth_Of_Binary_Tree {


    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }
    public static int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int depth = 1;

        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < q.size(); i++){
                TreeNode node = q.poll();

                if(node.left == null && node.right == null){
                    return depth;
                }
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            depth++;
        }
        return -1;

    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        TreeNode root1 = new TreeNode(2, null, new TreeNode(3, null,
                new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))));
        System.out.println(minDepth(root));
        System.out.println(minDepth(root1));

    }
}
