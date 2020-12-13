package br.com.vinicius.hackerrank.heighOfBinaryTree;

import br.com.vinicius.study.model.Vertex;

import java.util.*;

public class HeighOfABinaryTree {

    /*
    class Node
        int data;
        Node left;
        Node right;
    */
    public static int height(Node root) {
        Stack<Node> stack = new Stack<>();
        List<Integer> visitedOnes = new ArrayList<>();
        Integer height = 0;

        stack.add(root);
        visitedOnes.add(root.data);

        System.out.println("root: " + root.data);

        int contador = 0;
        while (!stack.isEmpty()) {
            Node actual = stack.pop();


            Stack<Node> neighbors = new Stack<>();
            neighbors.push(actual.left);
            neighbors.push(actual.right);

            if(actual.right == null && actual.left == null) {
                if(contador > height)
                    height = contador;

                contador = 0;
            }

            for (Node v : neighbors) {
                if (v != null && !visitedOnes.contains(v.data)) {
                    visitedOnes.add(v.data);
                    stack.push(v);
                    System.out.println("visitei o " + v.data);
                }
            }
            System.out.println("actual: "+ actual.data + ", contador: " + contador + ", height: " + height);
            contador++;
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
