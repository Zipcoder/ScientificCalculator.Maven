package com.zipcodewilmington.scientificcalculator;

import java.lang.*;
import com.sun.tools.javac.util.StringUtils;

public class CoreFunctions {

    Double display;

    //This is a constructor for CLass
    public CoreFunctions() {

    }

    /*public double displayScreen() {
        display = 0.0;
        return display;
    }*/

    public boolean IsANumber(Double input) {
        return true;
    }

    /*public class convertToDouble {
        private String number1;
        double convertedNumber = Double.parseDouble(number1);
    }*/
    public Double Add(Double a, Double b) {
        Double sum = a + b;
        return sum;
    }

    public Double Subtract(Double a, Double b) {
        Double sum = a - b;
        return sum;
    }

    public Double Multiply(Double a, Double b) {
        Double sum = a * b;
        return sum;
    }

    public Double Divide(Double a, Double b) {
        Double sum = a / b;
        return sum;
    }

    public Double SquareRoot(Double a) {
        Double sum = Math.sqrt(a);
        return sum;
    }

    public Double Square(Double a, Double b) {
        Double sum = a - b;
        return sum;
    }

    public Double Inverse() {
        return null;
    }
}
