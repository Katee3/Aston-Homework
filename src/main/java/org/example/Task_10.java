package org.example;

import java.util.Arrays;

public class Task_10 {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 1, 1, 0, 0, 1, 0, 0, 0};
        System.out.println("Array: " + Arrays.toString(array1));
        changeArray(array1);
        System.out.println("Changed array: " + Arrays.toString(array1));
    }
    public static void changeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                array[i] = 0;
            }
            else {
                array[i] = 1;
            }
        }
    }
}
