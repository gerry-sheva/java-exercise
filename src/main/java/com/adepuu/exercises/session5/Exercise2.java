package com.adepuu.exercises.session5;

public class Exercise2 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        boolean result = solution2.findDuplicate();
        System.out.println(result);
    }
}

class Solution2 {
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
