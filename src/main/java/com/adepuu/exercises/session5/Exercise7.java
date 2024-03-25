package com.adepuu.exercises.session5;

import java.util.ArrayList;

public class Exercise7 {
    /**
     * Java String Program to Check Anagram
     *
     * Example 1:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     *
     * Example 2:
     * Input: s = "rat", t = "car"
     * Output: false
     */
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        solution7.numOfDays();
    }
}

class Solution7 {
    public void numOfDays() {
        int[] input = {73,74,75,71,69,72,76,73};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < input.length; i++ ) {
            int counter = 0;
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] < input[j]) {
                    counter++;
                    break;
                }
                counter++;
            }
            arrayList.add(counter);
        }
        System.out.println(arrayList);
    }
}
