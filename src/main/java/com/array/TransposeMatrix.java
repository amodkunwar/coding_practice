package com.array;

public class TransposeMatrix {

    public static void main(String[] args) {
        // transponse of a matrix
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        printArray(arr, "original");

        int[][] ints = transposeMatrix(arr);

        printArray(ints, "transpose");
    }

    private static int[][] transposeMatrix(int[][] arr) {

        int row = arr.length;
        int col = arr[0].length;
        int[][] transpose = new int[col][row];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        return transpose;

    }

    private static void printArray(int[][] arr, String name) {

        System.out.println("Printing " + name + " matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
