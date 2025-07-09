package com.programs.arrays;

public class LargestElementInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 60,10,2,7,20,33};
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}  