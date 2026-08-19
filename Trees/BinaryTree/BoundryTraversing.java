// package Trees.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int data;
    Node left , right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BoundryTraversing {

    public static List<Integer> traverse(Node root){
        List<Integer> ans = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if(temp.left == null && temp.right == null){
                ans.add(temp.data);
            } else if(temp.left != null){
                queue.offer(temp.left);
            } else if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
        return ans;
    }
    Node root;
    public BoundryTraversing(){
        root = null;
    }

    public static void main(String[] args) {
        BoundryTraversing tree = new BoundryTraversing();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        // tree.root.right.left = new Node(6);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(8);
        tree.root.right.right.right = new Node(9);
        tree.root.right.right.right.left = new Node(10);

        List<Integer> ans = traverse(tree.root);

        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}
