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


public class ZigZagOrder {

    public static List<List<Integer>> Traverse(Node root){
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        if(root == null) return ans;

        queue.offer(root);
        boolean flip = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            Integer[] temp = new Integer[size];

            for(int i = 0 ; i < size ; i++){
                Node frontNode = queue.poll();
                int posi = (flip) ? i : (size - 1 - i);

                temp[posi] = frontNode.data;

                if(frontNode.left != null) queue.offer(frontNode.left);
                if(frontNode.right != null) queue.offer(frontNode.right);
            }
            flip = !flip;
            ans.add(new ArrayList<>(List.of(temp)));
        }
        return ans; 
    }

    Node root;
    public ZigZagOrder(){
        root = null;
    }
    public static void main(String[] args) {

        ZigZagOrder tree = new ZigZagOrder();
        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(8);
        tree.root.right.right.right = new Node(9);
        tree.root.right.right.right.left = new Node(10);

        List<List<Integer>> ans = Traverse(tree.root);

        for(List<Integer> temp : ans){
            for(int i : temp){
                System.out.print( i + " ");
            }
            System.out.println();
        }
    }
    
}
