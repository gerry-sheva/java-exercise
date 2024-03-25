package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        boolean result = solution7.Anagram();
        System.out.println(result);
    }
}

class Solution7 {
    public boolean Anagram() {
        String input = "anagram";
        String target = "nagaram";
        char[] inputChars = input.toCharArray();
        char[] targetChars = target.toCharArray();

        HashMap<Character, Integer> inputHash = new HashMap<Character, Integer>();
        for (char c: inputChars) {
            if (!inputHash.containsKey(c)) {
                inputHash.put(c, 1);
            } else {
                Integer freq = inputHash.get(c);
                freq++;
                inputHash.put(c, freq);
            }
        }

        HashMap<Character, Integer> targetHash = new HashMap<Character, Integer>();
        for (char c: targetChars) {
            if (!inputHash.containsKey(c)){
                return false;
            }
            if (!targetHash.containsKey(c)){
                targetHash.put(c, 1);
            } else {
                int freq = targetHash.get(c);
                freq++;
                targetHash.put(c, freq);
            }
        }

        if (inputHash.size() != targetHash.size()) {
            return false;
        }

        for (Map.Entry<Character, Integer> entry: inputHash.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            Integer targetValue = inputHash.get(key);

            if (!value.equals(targetValue)) {
                return false;
            }
        }
        return true;
    }
}
