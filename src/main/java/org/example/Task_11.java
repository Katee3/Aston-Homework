package org.example;

import java.util.Arrays;

public class Task_11 {
    public static void main(String[] args) {
        int[] mas = new int[100];

        for (int i = 0; i < 100; i++){
            mas[i] = i+1;
        }

        System.out.println(Arrays.toString(mas));
    }
}