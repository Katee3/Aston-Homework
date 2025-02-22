package org.example;

public class Task_6 {
    public static void main(String[] args) {
        printNumberSign(-5);
    }

    public static void printNumberSign(int number){
        if (number >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }
}