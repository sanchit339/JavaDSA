package Trees.BinaryTree;

// A binary tree is balanced if, for every node in the tree, the heights of the left and right subtrees differ by at most 1.


class Node{
    int data;
    Node left , right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BalancedBinaryTree {

    public static int isBalancedBinaryTree(Node node){
        if(node == null) return 0;    

        int leftH = isBalancedBinaryTree(node.left);
        if(leftH == -1) return -1;
        int rightH = isBalancedBinaryTree(node.right);
        if(rightH == -1) return -1;

        if(Math.abs(leftH - rightH) > 1) return -1;
        return Math.max(leftH, rightH) + 1;
    }

    Node root;
    public BalancedBinaryTree(){
        root = null;
    }

    public static void main(String[] args) {
        
        BalancedBinaryTree node = new BalancedBinaryTree();

        node.root = new Node(1);
        node.root.left = new Node(2);
        node.root.right = new Node(3);
        node.root.left.left = new Node(4);
        node.root.left.right = new Node(5);
        node.root.right.left = new Node(6);
        node.root.right.left = new Node(7);
        node.root.right.right = new Node(8);
        node.root.right.right.right = new Node(9);
        node.root.right.right.right.left = new Node(10);

        int ans = isBalancedBinaryTree(node.root);
        System.out.println(ans != -1 ? ans : -1);

    }
    
}
