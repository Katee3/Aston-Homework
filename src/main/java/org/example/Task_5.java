package org.example;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println(isSumInInterval(12, 8));
    }

    public static boolean isSumInInterval(int num1, int num2) {
        int sum = num1 + num2;
        return sum >= 10 && sum <= 20;
    }
}
