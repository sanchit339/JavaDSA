/**
 *      1
      /   \
     2     3
    /     / \
   4     7   8
    \         \
     5         9
      \       /
       6    11

    [[4] , [2 , 5] , [1 , 7 , 6] , [3] , [8 . 11 ] , [9]]
 */

import java.util.ArrayList;
import java.util.List;
import java.util.AbstractMap.SimpleEntry; // acts like a Pair
import java.util.Map;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class VerticalOrder {

    Node root;

    // ✅ List of Pair<NodeData, HorizontalDistance>
    List<SimpleEntry<Integer, Integer>> listOfPairs;

    public VerticalOrder() {
        root = null;
        listOfPairs = new ArrayList<>();
    }

    // Recursive function with visited flag as parameter
    public void traverse(Node node, int hd, boolean[] visitedFlag) {
        if (node == null) return;

        // ✅ Only add if flag is false
        if (!visitedFlag[0]) {
            listOfPairs.add(new SimpleEntry<>(node.data, hd));
            visitedFlag[0] = true; // mark visited
        }

        // Left recursion
        traverse(node.left, hd - 1, new boolean[]{false});

        // Right recursion
        traverse(node.right, hd + 1, new boolean[]{false});
    }

    public static void main(String[] args) {
        VerticalOrder tree = new VerticalOrder();

        // Create nodes
        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);

        tree.root.left.left.right = new Node(5);
        tree.root.left.left.right.right = new Node(6);

        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(8);

        tree.root.right.right.right = new Node(9);
        tree.root.right.right.right.left = new Node(11);

        // ✅ Start recursion with hd=0 and flag=false
        tree.traverse(tree.root, 0, new boolean[]{false});

        Map<Integer , List<Integer>> map;

        // Print pairs (NodeData , HorizontalDistance)
        for (SimpleEntry<Integer, Integer> pair : tree.listOfPairs) {
            System.out.println("Node " + pair.getKey() + " , HD = " + pair.getValue());
        }

        System.out.println("Tree created successfully!");
    }
}