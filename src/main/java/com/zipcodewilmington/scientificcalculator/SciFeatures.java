package com.zipcodewilmington.scientificcalculator;


import java.util.Stack;

import static java.lang.Math.*;

public class SciFeatures {


    public SciFeatures(){
    }

    public String unitsMode;
    public String displayMode;

    public double p;

    public void setDisplayMode(String a) {
        this.displayMode = a;
    }
    public String getDisplayMode(){
        return this.displayMode;
    }

    public void switchDisplayMode() {
        if (displayMode.equals("binary")) {
            displayMode = "octal";
        } else if (displayMode.equals("octal")) {
            displayMode = "decimal";
        } else if (displayMode.equals("decimal")) {
            displayMode = "hexadecimal";
        } else {
            displayMode = "binary";
        }
    }



    public void switchDisplayMode(String mode) {
        displayMode = mode;
    }

    public void storeMemory(double a) {
        this.p = a;
    }

    public void clearMemory() {
        this.p = Double.NaN;
    }

    public double memoryRecall(){
        return this.p;
    }

    public double sine(double a) {
        return sin(a);
    }

    public double cosine(double a) {
        return cos(a);
    }

    public double tangent(double a) {
        return tan(a);
    }

    public double sineInverse(double a) {
        return asin(a);
    }

    public double cosineInverse(double a) {
        return acos(a);
    }

    public double tangentInverse(double a) {
        return atan(a);
    }

    public double toDegree(double a){
        return toDegrees(a);
    }

    public void switchUnitsMode() {
        if (unitsMode.equals("Degrees")) {
            unitsMode = "Radians";
        }
        else {
            unitsMode = "Degrees";
        }
    }

    public void switchUnitsMode(String mode){
        unitsMode = mode;
    }

    public double logarithm(double a) {
        return log10(a);
    }

    public double inverseLog(double a) {
        return Math.pow(10, a);
    }

    public double naturalLog(double a) {
        return Math.log(a);
    }

    public double inverseNaturalLog(double a){
        return exp(a);
    }



    public int factorial(int a) {
        int sum = 1;
        for (int i = 2; i <= a; i++){
            sum *= i;
        }
        return sum;
    }


}
