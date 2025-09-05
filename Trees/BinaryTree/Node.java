package Trees.BinaryTree;

public class Node {
    int data;
    Node left , right; // constructor 

    Node(int data){
        this.data = data;
        left = right = null;
    }
    
}

class BinaryTree {
    
    Node root;

    public BinaryTree(){
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
    }
}