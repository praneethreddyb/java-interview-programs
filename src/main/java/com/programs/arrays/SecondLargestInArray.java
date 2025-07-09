package com.programs.arrays;

class SecondLargestInArray {
    
    static int getSecondLargest(int[] arr) {
        int n = arr.length;
        int largest = -1, secondLargest = -1;
        for (int j : arr) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            }
            else if (j < largest && j > secondLargest) {
                secondLargest = j;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
}