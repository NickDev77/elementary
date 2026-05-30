package ru.calculator;

import ru.math.MathFunction;

import static ru.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double sumSubtractionAndDivision(double first, double second) {
        return MathFunction.subtraction(first, second)
                + MathFunction.division(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second)
                + MathFunction.subtraction(first, second)
                + MathFunction.division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Разность и деление (10, 20): " + sumSubtractionAndDivision(10, 20));
        System.out.println("Все операции (10, 20): " + sumAllOperations(10, 20));
    }
}
