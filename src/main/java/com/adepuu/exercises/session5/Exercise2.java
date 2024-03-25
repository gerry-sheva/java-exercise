package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        ArrayList<Integer> array = solution2.arrayRotation();
        System.out.println(array);
    }
}

class Solution2 {
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
