package com.programs.strings;

import java.util.Arrays;
public class AnagramCheckerUsingBuiltInMethods {
   public static void main(String[] args) {
      // initializing two Strings
      String inputStr1 = "Heart";
      String inputStr2 = "Earth";
      System.out.println("The given strings are: " + inputStr1 +" and " + inputStr2);
      // converting their characters to lowercase
      inputStr1 = inputStr1.toLowerCase();
      inputStr2 = inputStr2.toLowerCase();
      // checking length
      if(inputStr1.length() == inputStr2.length()) { 
         // converting the given strings into character arrays
         char[] array1 = inputStr1.toCharArray();
         char[] array2 = inputStr2.toCharArray();
         // sorting both arrays
         Arrays.sort(array1);
         Arrays.sort(array2);
         // checking equality and printing the result
         if(Arrays.equals(array1, array2)) {
            System.out.println("Both strings are anagram");
         } else {
            System.out.println("Both strings are not anagram.");
         }
      } else {
         System.out.println("Both strings are not anagram.");
      }
   }
}