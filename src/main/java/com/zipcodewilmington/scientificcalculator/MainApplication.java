package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {


        //New User
        Calculator user = new Calculator(0, 0, 0, 0);
        Console.println("Simple Calculator!");

        /////Print Starting Display
        Console.println("Your current total is %.2f", user.getDisplayVal());

        //Start Program 1st Round
        while (true) {

            //Stores Operation
            String operator = "";

            //Get first value and set to display value
            user.setFirstVal("Enter a starting value");
            Console.println("Your current total is %.2f", user.getDisplayVal());

            //Start program operations loop
            while (true) {
                //Ask for operation and print to console
                String nextOperator;
                nextOperator = AskNumber.getOperation();

                if (nextOperator.equalsIgnoreCase("Add")) {
                    user.secondVal = AskNumber.askDouble();
                    user.displayVal = MathMethods.add(user.displayVal, user.secondVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("Subtract")) {
                    user.secondVal = AskNumber.askDouble();
                    user.displayVal = MathMethods.subtract(user.displayVal, user.secondVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("Multiply")) {
                    user.secondVal = AskNumber.askDouble();
                    user.displayVal = MathMethods.multiplication(user.displayVal, user.secondVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("Divide")) {
                    user.secondVal = AskNumber.askDouble();
                    if (user.secondVal == 0) {
                        Console.println("ERROR!");
                        user.displayVal = 0;
                        Console.println("Your current total is %.2f", user.getDisplayVal());
                        user.setFirstVal("Enter a starting value");
                    } else
                    user.displayVal = MathMethods.division(user.displayVal, user.secondVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("Remainder")) {
                    user.secondVal = AskNumber.askDouble();
                    user.displayVal = MathMethods.remainder(user.displayVal, user.secondVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("Square")) {
                    user.displayVal = MathMethods.square(user.displayVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("SquareRoot")) {
                    user.displayVal = MathMethods.squareRoot(user.displayVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("VariableExpo")) {
                    user.secondVal = AskNumber.askDouble();
                    user.displayVal = MathMethods.variExpo(user.displayVal,user.secondVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("Inverse")) {
                    user.displayVal = MathMethods.inverse(user.displayVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("-Num")) {
                    user.displayVal = MathMethods.invert(user.displayVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("M+")) {
                    user.savedVal = user.displayVal;
                    Console.println("You saved " + user.savedVal + " in memory.");
                } else if (nextOperator.equalsIgnoreCase("MC")) {
                    user.savedVal = 0;
                    Console.println("Memory reset.");
                } else if (nextOperator.equalsIgnoreCase("MRC")) {
                    Console.println("Your saved number is " + user.savedVal);
                } else if (nextOperator.equalsIgnoreCase("Sine")) {
                    user.displayVal = MathMethods.sine(user.displayVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("Cosine")) {
                    user.displayVal = MathMethods.cosine(user.displayVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("Tangent")) {
                    user.displayVal = MathMethods.tan(user.displayVal);
                    Console.println("Your current total is %.2f", user.displayVal);
                } else if (nextOperator.equalsIgnoreCase("Clear")) {
                    user.clearDisplayVal();
                    break;
                }
            }
        }
    }
}
