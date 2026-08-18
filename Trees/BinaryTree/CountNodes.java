// call the tree ans add left nodes and right nodes + 1

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
public class CountNodes {

    public static int numOfNodes(Node node){
        if(node == null) return 0;

        int left = numOfNodes(node.left);
        int right = numOfNodes(node.right);

        return (left + right) + 1;
    }

    Node root;

    public CountNodes(){
        this.root = null;
    }

    public static void main(String[] args) {
        CountNodes node = new CountNodes();

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

        int ans = numOfNodes(node.root);
        System.out.println(ans);

    }
    
}
