package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        ArrayList<Integer> result =  solution4.removeDuplicate();
        System.out.println(result);
    }
}

 class Solution4 {
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
 }
