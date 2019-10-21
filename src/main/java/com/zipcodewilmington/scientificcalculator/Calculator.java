package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    public static String add(double x, double y) {
        return String.valueOf(x + y);
    }

    public static String subtract(double x, double y) {
        return String.valueOf(x - y);
    }

    public static String multiply(double x, double y) {
        return String.valueOf(x * y);
    }

    public static String divide(double x, double y) {
        String quotient;
        if (y != 0) {
            quotient = String.valueOf(x / y);
        } else {
            quotient = "Err";
        }
        return quotient;
    }

    public static String square(double x) {
        return String.valueOf(x * x);
    }
    public static String sqrt(double x) {
        return String.valueOf(Math.sqrt(x));
    }
    public static String exp(double x, double y) { return String.valueOf(Math.pow(x,y)); }

    public static String inverse(double x) {
        return divide(1, x);
    }

    public static String invertSign(double x) {
        return String.valueOf(-x);
    }




}
