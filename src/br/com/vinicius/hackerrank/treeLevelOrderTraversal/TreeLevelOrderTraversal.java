package br.com.vinicius.hackerrank.treeLevelOrderTraversal;

import java.util.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class TreeLevelOrderTraversal {

    /*

    class Node
        int data;
        Node left;
        Node right;
    */
    public static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<Integer> visitedNodes = new ArrayList<>();
        StringBuilder finalResult = new StringBuilder();

        visitedNodes.add(root.data);
        queue.add(root);

        while (!queue.isEmpty()){
            Node actual = queue.remove();

            finalResult.append(actual.data).append(" ");

            Stack<Node> neighbors = new Stack<>();
            neighbors.push(actual.left);
            neighbors.push(actual.right);

            for (Node v : neighbors){
                if(v !=  null && !visitedNodes.contains(v)){
                    visitedNodes.add(v.data);
                    queue.add(v);
                }
            }
        }
        System.out.print(finalResult);
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }
}
