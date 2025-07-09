package com.programs.arrays;

import java.util.HashMap;

public class NumberFrequency {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int count = 1;
        for (Integer i : arr) {
            boolean isPresent = frequency.containsKey(i);
            if (isPresent) {
                count = frequency.get(i) + 1;
            }
            frequency.put(i, count);
        }
        frequency.entrySet().stream().map(x -> x.getKey() + " " + x.getValue())
                .forEach(System.out::println);
    }
}



