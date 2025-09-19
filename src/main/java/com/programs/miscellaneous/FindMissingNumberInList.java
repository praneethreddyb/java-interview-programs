package com.programs.miscellaneous;

import java.util.List;

public class FindMissingNumberInList {
    public static Integer findMissingNumberInList(List<Integer> integerList) {
        int n = integerList.size() + 1; // Since one number is missing
        int expectedSum = n * (n + 1) / 2;
        int actualSum = integerList.stream().mapToInt(Integer::intValue).sum();
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
       List<Integer> listData = List.of(1, 2, 3, 4, 6, 7, 8, 9, 10);
        System.out.println(findMissingNumberInList(listData));
    }
}