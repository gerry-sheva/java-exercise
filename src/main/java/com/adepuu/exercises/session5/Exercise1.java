package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        Solution largestInt = new Solution();
        int largest = largestInt.largestInt();
    }
}
class Solution {
    public int largestInt() {
        int[] input = {7,2,5,1,4};
        int size = input.length;
        Quicksort.quickSort(input, 0, size - 1);
        return input[size-1];
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

