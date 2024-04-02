package com.adepuu.exercises.session11;

import java.util.Scanner;

public class BinarySearchTree {
    /**
     * Write a Java binary search tree program that can scale dynamically
     * <p>
     * As a user, I want to insert N-numbers into a binary search tree and then search for a specific number. After searching, the program should prompt me to search for another number without terminating.
     * <p>
     * Acceptance Criteria:
     * - The program should start by prompting the user to enter the number of elements (N) they wish to insert into the binary search tree.
     * - The program should then prompt the user to enter N numbers one by one.
     * <p>
     * Acceptance Criteria:
     * - The program should correctly insert each number into the binary search tree in a way that maintains the binary search tree properties (all nodes in the left subtree are less than the root, and all nodes in the right subtree are greater than the root).
     * - The program should handle duplicate numbers appropriately, either by ignoring them or by updating the existing node.
     * - After inserting all N-numbers, the program should prompt the user to enter a number to search for within the binary search tree.
     * - The program should perform a binary search to find the entered number, following the binary search tree properties.
     * - The program should display whether the number is found or not.
     * - The program should provide a clear and straightforward way for the user to exit the continuous search loop and terminate the program, such as entering a specific keyword or command.
     *
     */
    public static void main(String[] args) {
        controller();
    }

    public static void controller() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the size of your array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int counter = 0;
        while (counter < size) {
            System.out.println("Input the number that you want to insert: (-1 to quit)");
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            array[searchIndex(array, 0, array.length - 1, num)] = num;
            counter++;
        }
        System.out.println("Input the number that you want to search: ");
        int target = scanner.nextInt();
        System.out.println(search(array, 0, array.length - 1, target));
    }

    public static boolean search(int[] nums, int lo, int hi, int target) {
        int mid = (lo + hi) / 2;
        if (target == nums[mid]) {
            return true;
        }
        if (lo < hi) {
            if (target < nums[mid]) {
                return search(nums, lo, mid - 1, target);
            } else if (target > nums[mid]){
                return search(nums, mid + 1, hi, target);
            }
        }
        return false;
    }

    public static int searchIndex(int[] nums, int lo, int hi, int target) {
        int mid = (lo + hi) / 2;
        if (target == nums[mid]) {
            return mid;
        }
        if (lo < hi) {
            if (target < nums[mid]) {
                return searchIndex(nums, lo, mid - 1, target);
            } else if (target > nums[mid]){
                return searchIndex(nums, mid + 1, hi, target);
            }
        }
        if (target > nums[mid]) {
            return mid;
        } else if (mid > 0) {
            return mid - 1;
        } else return 0;
    }
}
