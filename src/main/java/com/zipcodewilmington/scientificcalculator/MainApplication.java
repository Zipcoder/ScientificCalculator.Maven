package com.zipcodewilmington.scientificcalculator;

// comments

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Double i = Console.getDoubleInput("Enter a double");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
    }

    public static double calculator (String s, double i, double d) {
        double result = 0;
            switch (s) {
                case "+":
                    result = CalculatorOperator.addition(i, d);
                    break;
                case "-":
                    result = CalculatorOperator.subtraction(i, d);
                    break;
                case "*":
                    result = CalculatorOperator.multiplication(i, d);
                    break;
                case "/":
                    result = CalculatorOperator.division(i,d);
                    break;
            }
            return result;
        }
    }
