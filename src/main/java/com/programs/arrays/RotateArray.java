package com.programs.arrays;

import java.util.Arrays;

class RotateArray {

    // Function to rotate array
    static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        d = d % n;

        // Storing rotated version of array
        int[] temp = new int[n];

        // Keeping track of the current index
        // of temp[]
        int k = 0;

        // Storing the n - d elements of
        // array arr[] to the front of temp[]
        for (int i = d; i < n; i++) {
            temp[k++] = arr[i];
        }

        // Storing the first d elements of array arr[]
        // into temp
        for (int i = 0; i < d; i++) {
            temp[k++] = arr[i];
        }

        // Copying the elements of temp[] into arr[]
        // to get the final rotated array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        // Function calling
        rotateArray(arr, d);

        // Printing the array
        System.out.println(Arrays.toString(arr));
    }
}