package com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 18;

        int[] ints = twoSum(arr, target);

        System.out.println(Arrays.toString(ints));

    }

    private static int[] twoSum(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int value = target - arr[i];

            if (map.containsKey(value)) {
                int firstIndex = map.get(value);
                return new int[]{firstIndex, i};
            }

            map.put(arr[i], i);

        }

        return new int[]{-1, -1};

    }
}
