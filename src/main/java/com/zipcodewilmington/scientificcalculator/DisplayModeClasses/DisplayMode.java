package com.zipcodewilmington.scientificcalculator.DisplayModeClasses;

import com.zipcodewilmington.scientificcalculator.Console;

public class DisplayMode {

    static Integer currentMode = Constants.DECIMAL;
    static String trigInputMode = "Degrees";
    static String trigOutputMode = "Degrees";


    public static void switchDisplayMode() {

        if (currentMode == Constants.OCTAL) {
            currentMode = Constants.DECIMAL;
            Console.println("Display Mode set to Decimal.");
        } else if (currentMode == Constants.DECIMAL) {
            currentMode = Constants.HEXADECIMAL;
            Console.println("Display Mode set to Hexadecimal.");
        } else if (currentMode == Constants.HEXADECIMAL) {
            currentMode = Constants.BINARY;
            Console.println("Display Mode set to Binary.");
        } else {
            currentMode = Constants.OCTAL;
            Console.println("Display Mode set to Octal.");
        }

    }

    public static void switchDisplayMode(String modeInput) {

        if (modeInput.equalsIgnoreCase("Decimal")) {
            currentMode = Constants.DECIMAL;
            Console.println("Display Mode set to Decimal.");

        } else if (modeInput.equalsIgnoreCase("Hexadecimal")) {
            currentMode = Constants.HEXADECIMAL;
            Console.println("Display Mode set to Hexadecimal.");

        } else if (modeInput.equalsIgnoreCase("Binary")) {
            currentMode = Constants.BINARY;
            Console.println("Display Mode set to Binary.");

        } else if (modeInput.equalsIgnoreCase("Octal")) {
            currentMode = Constants.OCTAL;
            Console.println("Display Mode set to Octal.");
        }

    }

    public static String convertToSelectedMode(Double result) {
        if (currentMode == Constants.HEXADECIMAL) {
            return Double.toHexString(result);
        } else if (currentMode == Constants.BINARY) {
            Integer roundedResult = (int) Math.round(result);
            return Integer.toBinaryString(roundedResult);
        } else if (currentMode == Constants.OCTAL) {
            Integer roundedResult = (int) Math.round(result);
            return Integer.toOctalString(roundedResult);
        }
        return result.toString();
    }

    public static void rotateInputBetweenRadsDegs() {
        if (trigInputMode.equals("Degrees")) {
            Console.println("Trig input mode rotated to Radians.");
            trigInputMode = "Radians";
        } else if (trigInputMode.equals("Radians")) {
            Console.println("Trig input mode rotated to Degrees.");
            trigInputMode = "Degrees";
        }
    }

    public static void switchInputBetweenRadsDegs(String userModeSelection) {
        if (userModeSelection.equals("Degrees")) {
            Console.println("Trig input mode switched to Degrees.");
            trigInputMode = "Degrees";
        } else {
            Console.println("Trig input mode switched to Radians.");
            trigInputMode = "Radians";
        }
    }

    public static void rotateOutputBetweenRadsDegs() {
        if (trigOutputMode.equals("Degrees")) {
            Console.println("Trig output mode rotated to Radians.");
            trigOutputMode = "Radians";
        } else if (trigOutputMode.equals("Radians")) {
            Console.println("Trig output mode rotated to Degrees.");
            trigOutputMode = "Degrees";
        }
    }

    public static void switchOutputBetweenRadsDegs(String userModeSelection) {
        if (userModeSelection.equals("Radians")) {
            Console.println("Trig output mode switched to Radians.");
            trigOutputMode = "Radians";
        } else {
            Console.println("Trig output mode switched to Degrees.");
            trigOutputMode = "Degrees";
        }
    }

    public static Double convertInputToSelectedMode(Double input) {
        if (trigInputMode.equals("Radians")) {
            return Math.toRadians(input);
        } else {
            return Math.toDegrees(input);
        }
    }

    public static Double convertOutputToSelectedMode(Double result) {
        String s = "";
        if (trigOutputMode.equals("Radians")) {
            return Math.toRadians(result);
        } else {
            return Math.toDegrees(result);
        }
    }

}
