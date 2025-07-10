package com.programs.strings;

public class AnagramCheckerUsingForLoop {
   public static void sArr(char[] cArray) {
      int n = cArray.length;
      for (int i = 0; i < n - 1; i++) {
         for (int j = 0; j < n - i - 1; j++) {
            if (cArray[j] > cArray[j + 1]) {
               char temp = cArray[j];
               cArray[j] = cArray[j + 1];
               cArray[j + 1] = temp;
            }
         }
      }
   }
   // to check anagram    
   public static boolean checkAnagram(String inputStr1, String inputStr2) {
      inputStr1 = inputStr1.toLowerCase();
      inputStr2 = inputStr2.toLowerCase();
      if(inputStr1.length() == inputStr2.length()) {
         char[] array1 = inputStr1.toCharArray();
         char[] array2 = inputStr2.toCharArray();
         sArr(array1);
         sArr(array2);
         for (int i = 0; i < array1.length; i++) {
            if ( array1[i] !=  array2[i]) {
               return false;
            } 
         }
         return true;
      } else {
          return false;
      } 
   }
   public static void main(String[] args) {
      String inputStr1 = "Race";
      String inputStr2 = "Care";
      System.out.println("The given strings are: " + inputStr1 + " and " + inputStr2);
      if (checkAnagram(inputStr1, inputStr2)) {
         System.out.println("Both strings are anagram");
      } else {
         System.out.println("Both strings are not anagram.");
      }
   }
}