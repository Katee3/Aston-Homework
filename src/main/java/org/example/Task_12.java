package org.example;

import java.util.Arrays;

public class Task_12 {
    public static void main(String[] args) {
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mas.length; i++){
            if (mas[i] < 6){
                mas[i] = mas[i]*2;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}