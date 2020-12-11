package br.com.vinicius.hackerrank.heighOfBinaryTree;

import java.util.Scanner;

public class HeighOfBinaryTreeApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = HeighOfABinaryTree.insert(root, data);
        }
        scan.close();
        int height = HeighOfABinaryTree.height(root);
        System.out.println(height);
    }
}
