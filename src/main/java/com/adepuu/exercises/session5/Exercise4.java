package com.adepuu.exercises.session5;

import java.util.ArrayList;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        solution4.removeAllOccurrences();
    }
}

 class Solution4 {
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
