package org.example;

public class Task_9 {
    public static void main(String[] args) {
        System.out.println(isYearVesokosny(403));
    }
    public static boolean isYearVesokosny(int year){
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}