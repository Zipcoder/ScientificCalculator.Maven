package com.zipcodewilmington.scientificcalculator;

public class CoreMethods {

    public CoreMethods() {
    }

    //1 calcAdd
    public double calcAdd(double a, double b) {
        return a + b;
    }

    //2 calcSub
    public double calcSub(double a, double b) {
        return a - b;
    }

    //3 calcMultiply
    public double calcMultiply(double a, double b) {
        return a * b;
    }
    //4 calcDiv
    public double calcDiv(double a, double b) {
        double result = a / b;
        return result;
    }

    //5 calcSquared
    public double calcSquared(double a) {
        return a * a;
    }

    //6 calcToPower
    public double calcToPower(double a, double b) {
        return Math.pow(a, b);
    }

    //7 calcSqrt
    public double calcSqrt(double a) {
        return Math.sqrt(a);
    }

    //8 calcInverse
    public double calcInverse(double a) {
        return 1 / a;
    }

    //9 calcPosNeg
    public double calcPosNeg(double a) {
        return a * -1;
    }

}





