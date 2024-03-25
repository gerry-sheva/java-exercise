package com.adepuu.exercises.session5;

import java.util.ArrayList;

public class Exercise8 {
    /**
     * Java String Program to Find all Duplicates on Array
     *
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     *
     * Example 2:
     * Input: nums = [1,1,2]
     * Output: [1]
     *
     * Example 3:
     * Input: nums = [1]
     * Output: []
     */
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        solution8.findDuplicate();
    }
}

class Solution8 {
    public void findDuplicate() {
        int[] input = {4,3,2,7,8,2,3,1};
        Quicksort.quickSort(input, 0, input.length - 1);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < input.length; i++) {
            if (input[i] == input[i - 1]) {
                arrayList.add(input[i]);
            }
        }
        System.out.println(arrayList);
    }
}
