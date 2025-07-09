package com.programs.arrays;// Java program to find the third largest
// element in an array.

class ThirdHighestInArray {
    static int thirdLargest(int[] arr) {
        int n = arr.length;
        
        // Find the first maximum element.
        int first = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) first = arr[i];
        }
        
        // Find the second max element.
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }
        
        // Find the third largest element.
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > third && arr[i] < second) {
                third = arr[i];
            }
        }
        
        // Return the third largest element 
        return third;
    }

    public static void main(String[] args) {
        int[] arr = {1, 14, 2, 16, 10, 20};
        System.out.println(thirdLargest(arr));
    }
}