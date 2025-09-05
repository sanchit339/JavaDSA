package Trees.BinaryTree;

public class TreeTraversals {
    
    public static class Node {
        int data;
        Node left , right;

        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void preOrder(Node node){
        
        if(node == null) return;

        System.out.print(node.data + " ");

        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void postOrder(Node node){
        if(node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
    public static void main(String[] args) {
        Node treeNode = new Node(1);
        treeNode.left = new Node(2);
        treeNode.right = new Node(3);
        treeNode.left.left = new Node(4);
        treeNode.left.right = new Node(5);

        preOrder(treeNode);
        System.out.println();
        inOrder(treeNode);
        System.out.println();
        postOrder(treeNode);

    }
}
