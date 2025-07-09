package com.programs.arrays;

class MoveZerosToEnd {

    static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int k : arr) {
            if (k != 0){
                temp[j++] = k;
            }
        }
        while (j < n){
            temp[j++] = 0;
        }
        for (int i = 0; i < n; i++){
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}