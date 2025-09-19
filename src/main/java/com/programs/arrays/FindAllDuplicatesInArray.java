package com.programs.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindAllDuplicatesInArray {

    // Find all duplicates in an array
    public static void findDuplicates(int[] arr) {
        System.out.println("Duplicate elements in given array: ");
        for (int i = 0; i < arr.length; i++) {
            int val = Math.abs(arr[i]);
            if (val >= 1 && val <= arr.length) {
                int index = val - 1;
                if (arr[index] < 0) {
                    System.out.print(val + " ");
                } else {
                    arr[index] = -arr[index];
                }
            }
        }
    }

    public static Set<Integer> findDuplicatesUsingSet(Integer[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Integer integer : arr) {
            if (!set.add(integer)) {
                duplicates.add(integer);
            }
        }
        return duplicates;

    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 12, 14, 2, 45, 3, 4, 2, 7, 8, 8, 3, 8};
        int[] arr1 = new int[]{1, 2, 12, 14, 2, 45, 3, 4, 2, 7, 8, 8, 3, 8};
        findDuplicatesUsingSet(arr).forEach(System.out::println);
        findDuplicates(arr1);
    }
}
