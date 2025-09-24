package com.array;

import java.util.Arrays;

/**
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int sum = Arrays.stream(arr).sum();
        int n = arr.length;

        int expected = n * (n + 1) / 2;

        int missing = expected - sum;

        System.out.println("Missing number is : " + missing);

    }
}
