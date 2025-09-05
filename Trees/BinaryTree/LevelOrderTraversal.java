/**
 * Just Normal Traversal
 */

package Trees.BinaryTree;

import java.util.*;

public class LevelOrderTraversal {
    public static class Node {
        int data;
        Node left , right;

        Node(int data){
            this.data = data;
            left = null ;
            right = null;
        }   
    }

    public static List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        Queue<Node> queue = new LinkedList<Node>();

        if(root == null) return ans;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> subList = new LinkedList<>();

            for(int i = 0 ; i < level ; i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);

                // add the root 
                subList.add(queue.poll().data); // add and remove it 
            }
            ans.add(subList);
        }
        return ans;
        
    }
    public static void main(String[] args) {
        Node treeNode = new Node(1);
        treeNode.left = new Node(2);
        treeNode.right = new Node(3);
        treeNode.left.left = new Node(4);
        treeNode.left.right = new Node(5);

        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        ans = levelOrder(treeNode);

        for(List<Integer> subList : ans){
            for(int i : subList){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
