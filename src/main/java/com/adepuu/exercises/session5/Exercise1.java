package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int largest = solution.largestInt();
        ArrayList<Integer> array = solution.arrayRotation();
    }
}
class Solution {
    public int largestInt() {
        int[] input = {7,2,5,1,4};
        int size = input.length;
        Quicksort.quickSort(input, 0, size - 1);
        System.out.println(Arrays.toString(input));
        return input[size-1];
    }

    public ArrayList<Integer> arrayRotation() {
        int[] array = {1,2,3,4,5,6,7};
        int d = 2;
        int[] right = Arrays.copyOfRange(array, 0, d);
        int[] left = Arrays.copyOfRange(array, d, array.length-1);
        ArrayList<Integer> combined = new ArrayList<>();
        for (int i : left) {
            combined.add(i);
        }
        for (int i : right) {
            combined.add(i);
        }
        return combined;
    }
}
 class Quicksort {
    static int partition(int array[], int low, int high) {
        int pivot = array[high];

        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
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

