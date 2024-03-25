package com.adepuu.exercises.session5;

import java.util.ArrayList;

public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     *
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     *
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        solution6.removeAllOccurrences();
    }
}

class Solution6 {
    public void removeAllOccurrences() {
        int[] input = {1, 2, 1,9,0, 3, 5, 1};
        int target = 1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i] != target) {
                arrayList.add(input[i]);
            }
        }
        System.out.println(arrayList);
    }
}
