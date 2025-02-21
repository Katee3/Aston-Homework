package org.example;

import java.util.Arrays;

public class Task_13 {
    public static void main(String[] args) {
        int n = 5;
        int[][] mas = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || n-1-i == j) {
                    mas[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }
    }
}