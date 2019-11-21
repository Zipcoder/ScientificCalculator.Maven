package com.zipcodewilmington.scientificcalculator;

public class LogFunctions {
    public Double log(double num1) {
        return Math.log10(num1);
    }

    public Double inverseLog(double num1) {
        return Math.pow(10, num1);
    }

    public Double naturalLog(double num1) {
        return Math.log(num1);
    }

    public Double inverseNaturalLog(double num1) {
        return Math.pow(2.71828182846, num1);
    }
}

