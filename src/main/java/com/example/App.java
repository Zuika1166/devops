package com.example;

public class App {

    public static void main(String[] args) {
        printAddition(2, 3);
    }

    private static void printAddition(int a, int b) {
        System.out.println(add(a, b));
    }

    public static int add(int left, int right) {
        int total = left + right;
        return total;
    }
}
