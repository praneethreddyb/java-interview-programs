package com.programs.miscellaneous;

public class FibnacciExample {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        int length = 10;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= length; i++) { // Fixed loop condition to include the 10th term
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
