package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise3 {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     *
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     *
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        ArrayList<Integer> arrayList = solution3.removeDuplicate();
        System.out.println(arrayList);
        solution3.sort();
    }

}

class Solution3 {

    public ArrayList<Integer> removeDuplicate() {
        int[] input = {1,1,9,1,3,3,5,4,3,2,4,2};
        Quicksort.quickSort(input, 0, input.length - 1);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(input[0]);
        for (int i = 1; i < input.length; i++) {
            if (input[i] != input[i-1]) {
                arrayList.add(input[i]);
            }
        }
        return arrayList;
    }

    public void sort() {
        int[] input = {1,1,9,1,3,3,5,4,3,2,4,2};
        String direction = "asc";
        if (direction.equals("asc")) {
            Quicksort.quickSort(input, 0, input.length - 1);
            System.out.println(Arrays.toString(input));
        } else {
            ReversedQuicksort.quickSort(input, 0, input.length - 1);
            System.out.println(Arrays.toString(input));
        }

    }
}
class ReversedQuicksort {
    static int partition(int array[], int low, int high) {
        int pivot = array[high];

        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] >= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return (i + 1);
    }

    static void quickSort(int array[], int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
}
