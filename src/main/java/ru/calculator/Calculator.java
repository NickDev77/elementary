package ru.calculator;

public class Calculator {
    public static void main(String[] args) {
        plus(100, 500);
        plus(4, 2);
        plus(3, 5);
    }

    public static void plus(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }
}



