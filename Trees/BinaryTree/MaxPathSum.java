package Trees.BinaryTree;

class Node{
    int data;
    Node left , right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class MaxPathSum {
    public static int sum = 0;
    public static int MaxSum(Node node){
        if(node == null) return 0;

        int leftS = MaxSum(node.left);
        int rightS = MaxSum(node.right);

        sum = Math.max((leftS + rightS) + node.data , sum); 

        return node.data + Math.max(leftS , rightS);
    }

    Node root;
    public MaxPathSum(){
        root = null;
    }

    public static void main(String[] args) {
        MaxPathSum node = new MaxPathSum();

        node.root = new Node(1);
        node.root.left = new Node(2);
        node.root.right = new Node(3);
        node.root.left.left = new Node(4);
        node.root.left.right = new Node(5);
        node.root.right.left = new Node(6);
        node.root.right.right = new Node(7);
        node.root.right.left.left = new Node(8);
        node.root.right.right.right = new Node(9);
        node.root.right.right.right.left = new Node(10);
        
        MaxSum(node.root);
        System.out.println(sum);
    }
}
