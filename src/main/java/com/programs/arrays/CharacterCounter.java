package com.programs.arrays;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

    public static void main(String[] args) {
        String inputString = "hello world";
        countCharacterOccurrences(inputString);
    }

    public static void countCharacterOccurrences(String str) {
        // Create a HashMap to store character counts
        Map<Character, Integer> charCounts = new HashMap<>();

        // Convert the string to a character array for easier iteration
        char[] charArray = str.toCharArray();

        // Iterate through each character in the array
        for (char c : charArray) {
            charCounts.put(c,charCounts.getOrDefault(c,0)+1);
            // If the character is already in the map, increment its count
//            if (charCounts.containsKey(c)) {
//                charCounts.put(c, charCounts.get(c) + 1);
//            } else {
                // If the character is not in the map, add it with a count of 1
//                charCounts.put(c, 1);
//            }
        }

        // Print the character occurrences
        System.out.println("Character occurrences in \"" + str + "\":");
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}