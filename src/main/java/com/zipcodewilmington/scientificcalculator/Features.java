package com.zipcodewilmington.scientificcalculator;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Features{

    public Features() {
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double square(double a) {
        return a * a;
    }

    public double root(double a) {
        return sqrt(a);
    }

    public double exponent(double a, double b) {
        return pow(a, b);
    }

    public double inverse(double a) {
        return 1 / a;
    }

    public double invert(double a) {
        return a * -1;
    }

    public int clear() {
        return 0;
    }



}

