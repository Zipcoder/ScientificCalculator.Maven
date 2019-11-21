package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
public class ScientificFunctions {

    public Boolean radians;
    public Boolean degrees;

    public static double sin(double a) {
        double b = Math.toRadians(a);
        return(Math.sin(b));
    }
    public static double cos(double a) {
        double b = Math.toRadians(a);
        return(Math.cos(b));
    }
    public static double tan(double a) {
        double b = Math.toRadians(a);
        return(Math.tan(b));
    }
    public static double asin(double a) {
        a = Math.PI;
        return(Math.asin(a));
    }
    public static double acos(double a) {
        a = Math.PI / 2;
        a = Math.toRadians(a);
        return(Math.acos(a));
    }
    public static double atan(double a) {
        a = Math.PI;
        return(Math.atan(a));
    }
    public static double factorial(double n) {
        int res = 1, i;
        for(i =2; i<=n; i++)
            res *=i;
        return res;
    }
    public static double toDegrees(double rad) {
        return(Math.toDegrees(rad));
    }

    public double switchUnits (double num1, int setter) {
        if (setter == 1) {
            double num2 = toDegrees(num1);
            return num2;
        } else {
            return num1;
        }
    }

}