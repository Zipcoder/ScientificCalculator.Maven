package com.zipcodewilmington.scientificcalculator;

import com.sun.org.apache.xerces.internal.impl.dv.xs.BaseDVFactory;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class SciCalculator {
    public static String sine(double x, boolean mode){ return String.valueOf(Math.sin(switchUnits(x, mode))); }
    public static String cosine(double x, boolean mode){ return String.valueOf(Math.cos(switchUnits(x, mode))); }
    public static String tangent(double x, boolean mode){ return String.valueOf(Math.tan(switchUnits(x, mode))); }
    public static String csc(double x, boolean mode){ return String.valueOf(Math.asin(switchUnits(x, mode))); }
    public static String sec(double x, boolean mode){ return String.valueOf(Math.acos(switchUnits(x, mode))); }
    public static String cotan(double x, boolean mode){ return String.valueOf(Math.atan(switchUnits(x, mode))); }


    public static String log(double x){ return String.valueOf(Math.log(x)); }//**Fix these
    public static String log10(double x){ return String.valueOf(Math.log10(x)); } //**Fix these
    public static String log1p(double x){ return String.valueOf(Math.log1p(x)); }//** Fix these
    public static String factorial(double x){
        x = Math.round(x);
        double total = Math.abs(x);
        double sign = Math.pow(x / total, total); //(±1)^n, n=|±x|
        if (x == 0) {
            total = 1;
        } else {
            for (int i = 1; i < Math.abs(x); i++) {
                total *= i;
            }
        }
        return String.valueOf(total * sign);
        }

    public static String switchDisplayMode(String currentMode, String operation) {
        String mode = "";
        String[] modes = {"binary", "octal", "decimal", "hexadecimal"};
        if (operation.equals("disp bin")) {
            mode = "binary";
        }
        else if (operation.equals("disp oct")) {
            mode = "octal";
        }
        else if (operation.equals("disp dec")) {
            mode = "decimal";
        }
        else if (operation.equals("disp hex")) {
            mode = "hexadecimal";
        }
        else {
            for (int i = 0; i < modes.length; i++) {
                if (currentMode.matches(modes[i])) {
                    int idx = i + 1;
                    if (idx >= modes.length) {
                        idx = 0;
                    }
                    mode = modes[idx];
                    break;
                }
            }
        }
        return mode;
    }

    public static String convertNumberToMode(String number, String mode) {
        String convertedNum = "";
        int num = (int) Math.round(Double.valueOf(number));

        if (mode.equals("binary")) {
            convertedNum = Integer.toBinaryString(num);
        }
        else if (mode.equals("octal")) {
            convertedNum = Integer.toOctalString(num);
        }
        else if (mode.equals("decimal")) {
            convertedNum = number;
        }
        else if (mode.equals("hexadecimal")) {
            convertedNum = Integer.toHexString(num);
        }
        return convertedNum;
    }

    //Method to Convert degrees to radians and vice-versa
    public static Double switchUnits(Double number, boolean mode) {
        Double num = Double.valueOf(number);
        Double convertedUnit;
        if (!mode) {
            convertedUnit = Math.toDegrees(num);
        } else {
            //convertedUnit = Math.toRadians(num);
            convertedUnit = number;
        }
    return convertedUnit;
    }
}
