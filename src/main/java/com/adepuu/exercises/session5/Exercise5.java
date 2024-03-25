package com.adepuu.exercises.session5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercise5 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        solution5.sort();
    }
}

class Solution5 {
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
