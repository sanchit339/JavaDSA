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
public class MaxDiameter {

    static int maxDia = 0; // as the depth will change with every call its better to be keep reference to it

    public static int diameter(Node node){

        if(node == null) return 0;

        int left = diameter(node.left);
        int right = diameter(node.right);
        
        maxDia = Math.max(maxDia, (left + right));

        return Math.max(left , right) + 1 ;
    }

    Node root;
    public MaxDiameter(){
        root = null;
    }
    public static void main(String[] args) {
        MaxDiameter node = new MaxDiameter();

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

        int ans = diameter(node.root) + 1;
        System.out.println(ans);
    }
}
