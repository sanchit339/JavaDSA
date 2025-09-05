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

public class IsIdenticalTree {

    public static boolean findIdentical(Node root1 , Node root2){

        if(root1 == null || root2 == null){
            if(root1 == root2) return true;
            else return false;
        }

        boolean check1 = findIdentical(root1.left, root2.left);
        if(check1 == false) return false;
        boolean check2 = findIdentical(root1.right, root2.right);
        if(check2 == false) return false;

        return (root1.data == root2.data);

    }

    Node root;

    public IsIdenticalTree(){
        root = null;
    }

    public static void main(String[] args) {
        IsIdenticalTree node1 = new IsIdenticalTree();
        IsIdenticalTree node2 = new IsIdenticalTree();

        node1.root = new Node(1);
        node1.root.left = new Node(2);
        node1.root.right = new Node(3);
        node1.root.left.left = new Node(4);
        node1.root.left.right = new Node(5);
        node1.root.right.left = new Node(6);
        node1.root.right.left = new Node(7);
        node1.root.right.right = new Node(8);
        node1.root.right.right.right = new Node(9);
        node1.root.right.right.right.right = new Node(10);


        node2.root = new Node(1);
        node2.root.left = new Node(2);
        node2.root.right = new Node(3);
        node2.root.left.left = new Node(4);
        node2.root.left.right = new Node(5);
        node2.root.right.left = new Node(6);
        node2.root.right.left = new Node(7);
        node2.root.right.right = new Node(8);
        node2.root.right.right.right = new Node(9);
        node2.root.right.right.right.right = new Node(10);

        System.out.println(findIdentical(node1.root, node2.root));
    }
}
