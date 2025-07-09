package com.programs.arrays;

import java.util.Arrays;

public class SortArrAsc {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 12, 14, 2, 45, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("Duplicate elements in given array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        Arrays.stream(arr).mapToObj(x -> String.valueOf(x) + " ").forEach(System.out::print);
    }
}  