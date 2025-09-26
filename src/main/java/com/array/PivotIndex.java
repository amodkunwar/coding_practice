package com.array;

import java.util.Arrays;

public class PivotIndex {

    public static void main(String[] args) {

        int[] arr = {1, 7, 3, 6, 5, 6};

        int pivotIndex = findPivotIndex(arr);

        System.out.println(pivotIndex);
    }

    private static int findPivotIndex(int[] arr) {

        int left = 0;

        int sum = Arrays.stream(arr).sum();

        for (int i = 0; i < arr.length; i++) {
            int right = sum - left - arr[i];
            if (right == left) {
                return i;
            }
            left += arr[i];
        }

        return -1;
    }
}
