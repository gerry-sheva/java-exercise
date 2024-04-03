package com.adepuu.exercises.session11;

import java.util.Scanner;

public class BinarySearchTree {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many data that you want to input?");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Input your number:");
            int input = scanner.nextInt();
            tree.insert(input);
        }
        System.out.println("Input the number that you want to search: ");
        int target = scanner.nextInt();
        boolean result = tree.find(target);
        System.out.println(result);
    }

    private static class Tree {
        Node root;

        public static class Node {
            int data;
            Node left;
            Node right;

            Node(int i) {
                data = i;
            }
        }

        public void insert(int i) {
            root = insertRec(root, i);
        }

        private Node insertRec(Node root, int key) {
            if (root == null) {
                root = new Node(key);
                return root;
            }

            if (key < root.data) {
                root.left = insertRec(root.left, key);
            } else if (key > root.data) {
                root.right = insertRec(root.right, key);
            }

            return root;
        }

        public boolean find(int target) {
            return findRec(root, target) != null;
        }

        private Node findRec(Node root, int target) {
            if (root == null || root.data == target) {
                return root;
            }

            if (target < root.data) {
                return findRec(root.left, target);
            }

            return findRec(root.right, target);
        }
    }
}
