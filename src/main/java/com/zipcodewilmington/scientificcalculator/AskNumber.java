package com.zipcodewilmington.scientificcalculator;

public class AskNumber {

    // Ask for a Double

    public static double askDouble() {
        double d = 0;
        d = Console.getDoubleInput("Enter a number.");
        return d;
    }

    // Ask for an Operator

    public static String getOperation() {
        String operator = "";
        String menu = "\nPlease type one of the following \nAdd  Subtract  Multiply  Divide  Remainder  Square  SquareRoot  VariableExpo\nInverse  -Num  M+  MC  MRC  Sine  Cosine  Tangent  Clear";
        operator = Console.getStringInput("What would you like to do?" + menu);
        while(!operator.equalsIgnoreCase("Add")  && !operator.equalsIgnoreCase("Subtract")  && !operator.equalsIgnoreCase("Multiply")  && !operator.equalsIgnoreCase("Divide") && !operator.equalsIgnoreCase("Remainder") && !operator.equalsIgnoreCase("Square") && !operator.equalsIgnoreCase("SquareRoot") && !operator.equalsIgnoreCase("VariableExpo") && !operator.equalsIgnoreCase("Inverse") && !operator.equalsIgnoreCase("-Num") && !operator.equalsIgnoreCase("M+") && !operator.equalsIgnoreCase("MC") && !operator.equalsIgnoreCase("MRC") && !operator.equalsIgnoreCase("Sine") && !operator.equalsIgnoreCase("Cosine") && !operator.equalsIgnoreCase("Tangent") && !operator.equalsIgnoreCase("Clear")){
            Console.println("You selected " + operator);
            operator = Console.getStringInput("Invalid Input! Please type one of the following" + menu);
        }
        return operator;
    }
}
