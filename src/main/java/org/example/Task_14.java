package org.example;

import java.util.Arrays;

public class Task_14 {
    public static int[] createFilledArray(int len, int initialValue) {
        int[] mas = new int[len];
        for (int i = 0; i < len; i++) {
            mas[i] = initialValue;
        }
        return mas;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createFilledArray(6,7)));
    }
}