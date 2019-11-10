package com.zipcodewilmington.scientificcalculator.OperationClasses;
import java.lang.Math ;

public class Exponents {

    public static Double variableExponent(Double baseNum, Double exp1) {
        Double output = Math.pow(baseNum, exp1);
        return output;
    }

    public static Double square(Double baseNum) {
        Double output = Math.pow(baseNum, 2);
        return output;
    }

    public static Double cubed(Double baseNum) {
        Double output = Math.pow(baseNum, 3);
        return output;
    }

    public static Double sqrt(Double baseNum) {
        Double output = Math.sqrt(baseNum);
        return output;
    }
}