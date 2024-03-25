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
        boolean result = solution3.findDuplicate();
        System.out.println(result);
    }

}

class Solution3 {
    public boolean findDuplicate() {
        int[] input = {1,2,1,3,4};
        Quicksort.quickSort(input, 0, input.length - 1);
        for (int i = 1; i < input.length; i++) {
            if (input[i] == input[i - 1]) {
                return true;
            }
        }
        return false;
    }
}

