package com.programs.miscellaneous;

public class RecursionReverseString {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        // System.out.println(str + " : " + str.substring(1) + " : " + str.charAt(0));
        String x = reverse(str.substring(1)) + str.charAt(0);
        //System.out.println(x+"************");
        return x;
    }

    public static void main(String[] args) {
        String str = "Ge";
        System.out.println(reverse(str));
    }
}