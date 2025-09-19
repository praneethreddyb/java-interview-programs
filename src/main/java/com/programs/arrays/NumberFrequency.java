package com.programs.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberFrequency {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> intersection = list1.stream()
                .filter(list2::contains)
                .toList();
        System.out.println(intersection);

        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");
        Map<String, Long> wordFrequency = words
                .stream()
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting())
                );

        System.out.println(wordFrequency);


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
//        frequency.entrySet().stream().
//                map(x -> x.getKey() + " " + x.getValue())
//                .forEach(System.out::println);
        //fix the below code
//       List<String> c =  Arrays.stream(arr).collect(Collectors.groupingBy(a-> a, Collectors.counting())).entrySet().stream()
//                .sorted(Comparator.comparingLong(Map.Entry::getValue).reversed())
//                .map(a-> a.getKey() + " " + a.getValue()).toList();
//        System.out.println(c.get(0));
    }
}



