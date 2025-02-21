package org.example;

public class Task_8 {
    public static void main(String[] args) {
        printTextNumberTimes("привет", 3);
    }

    public static void printTextNumberTimes(String text, int number) {
        for (int counter = 0; counter < number; counter++){
            System.out.println(text);
        }
    }
}
