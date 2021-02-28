package com.zipcodewilmington.scientificcalculator;

//comments

public class CalculatorOperator {

    public static double addition (double a, double b) {
        double addition = a + b;
        return addition;
    }

    public static double subtraction
            (double a, double b) {
        double subtraction = a - b;
        return subtraction;
    }

    public static double multiplication (double a, double b) {
        double multiplication = a * b;
        return multiplication;
    }

    public static double division (double a, double b) {
        double division = a / b;
        return division;
    }

    public static double square (double a) {
        double square = Math.pow(a,2);
        return square;
    }

    public static double squareRoot (double a) {
        double squareRoot = Math.sqrt(a);
        return squareRoot;
    }

    public static double exponents (double a, double b) {
        double exponent = Math.pow(a,b);
        return exponent;
    }

    public static double multiplicativeInverse (double a) {
        double multiplicativeInverse = 1/a;
        return multiplicativeInverse;
    }

    public static double additiveInverse (double a) {
        double additiveInverse = a * -1;
        return additiveInverse;
    }

}

