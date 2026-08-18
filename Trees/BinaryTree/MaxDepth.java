package Trees.BinaryTree;

class TreeNode{
    int data;
    TreeNode left , right;

    TreeNode(int data){
        this.data = data;
        this.right = null;
        this.left = null; 
    }
}

public class MaxDepth {

    public static void function(TreeNode node , int maxDepth ,int  globalMax){
        System.err.println(globalMax);
        if(node == null) return;

        function(node.left, maxDepth + 1 , Math.max(maxDepth, globalMax));
        function(node.right, maxDepth + 1, Math.max(maxDepth, globalMax));
    }

    public static int Depth(TreeNode node ){
        if(node == null) return 0;

        int leftH = Depth(node.left); // wait till getting the return from base case first
        int rightH = Depth(node.right);

        return Math.max(leftH, rightH) + 1;
    }

    TreeNode root ;
    public MaxDepth(){
        root = null;
    }
    public static void main(String[] args) {
        MaxDepth tree = new MaxDepth();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.left = new TreeNode(7);
        tree.root.right.right = new TreeNode(8);
        tree.root.right.right.right = new TreeNode(9);
        tree.root.right.right.right.left = new TreeNode(10);

        int ans = Depth(tree.root);
        System.out.println(ans);

    }
    
}
