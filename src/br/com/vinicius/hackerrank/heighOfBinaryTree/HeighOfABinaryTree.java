package br.com.vinicius.hackerrank.heighOfBinaryTree;

import java.util.*;

public class HeighOfABinaryTree {

    /*
    class Node
        int data;
        Node left;
        Node right;
    */
    public static int height(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<Integer> visitedOnes = new ArrayList<>();
        Integer height = 0;

        queue.add(root);
        visitedOnes.add(root.data);

        while (!queue.isEmpty()) {
            Node actual = queue.remove();

            System.out.println("Actual visited vertex " + actual.data);

            List<Node> listNeighhoods = Arrays.asList(actual.right, actual.left);
            for (Node v : listNeighhoods) {
                if (v != null && !visitedOnes.contains(v.data)) {
                    visitedOnes.add(v.data);
                    queue.add(v);
                }
            }
            height++;
        }

        return height;
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
}
