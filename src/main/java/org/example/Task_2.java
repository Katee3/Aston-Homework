package org.example;

public class Task_2 {
    public static void main(String[] args) {
        checkSumSign();
    }
    public static void checkSumSign() {
        int a = -30;
        int b = 30;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
