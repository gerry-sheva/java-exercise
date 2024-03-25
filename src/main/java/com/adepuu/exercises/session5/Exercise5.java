package com.adepuu.exercises.session5;

import java.util.HashMap;
import java.util.Map;

public class Exercise5 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        boolean result = solution5.anagram();
        System.out.println(result);
    }
}

class Solution5 {
    public boolean anagram() {
        String input = "anagram";
        String target = "nagaram";

        HashMap<Character, Integer> inputHash = new HashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            if (inputHash.containsKey(input.charAt(i))){
                inputHash.put(input.charAt(i), 1);
            } else {
                Integer freq = inputHash.get(input.charAt(i)) + 1;
                inputHash.put(input.charAt(i), freq);
            }
        }

        HashMap<Character, Integer> targetHash = new HashMap<Character, Integer>();
        for (int i = 0; i < target.length(); i++) {
            if (!inputHash.containsKey(target.charAt(i))){
                return false;
            }
            if (targetHash.containsKey(target.charAt(i))){
                targetHash.put(target.charAt(i), 1);
            } else {
                int freq = targetHash.get(target.charAt(i)) + 1;
                targetHash.put(target.charAt(i), freq);
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
