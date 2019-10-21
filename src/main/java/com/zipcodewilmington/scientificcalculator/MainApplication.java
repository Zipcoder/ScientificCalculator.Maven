package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        boolean turnOn = true;

        Console.println("Welcome to my calculator!");
      /*  String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter your number:.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d); */


        while (turnOn) {
            try {
                CoreMethods basic = new CoreMethods();
                double inputValue = Console.getDoubleInput("\n\nWhat can I help you with Today? \nChoose: \n1 - Addition \n"
                        + "2 - Subtraction \n" + "3 - Multiply  \n" + "4 - Division \n" + "5 - Square \n" + "6 - Power \n" +
                        "7 - Square Root \n" + "8 - Inverse \n" +"9 - Neg or Pos \n" + "10 - Turn off !");

                if (inputValue > 10) {
                    System.out.println("Error : Hey don't do that! ");
                    turnOn = false;
                }
                if (inputValue <= 0) {
                    System.out.println("Error : Hey don't do that! ");
                    turnOn = false;
                } else if (inputValue == 1) {
                    System.out.println("Addition Time!");
                    double a = Console.getDoubleInput("Enter your number:");
                    double b = Console.getDoubleInput("Enter your number:");
                    System.out.println(basic.calcAdd(a, b));
                } else if (inputValue == 2) {
                    System.out.println("Subtraction Time!");
                    double a = Console.getDoubleInput("Enter your number:");
                    double b = Console.getDoubleInput("Enter your number:");
                    System.out.println(basic.calcSub(a, b));
                }else if (inputValue == 3) {
                    System.out.println("Multiply Time! ");
                    double a = Console.getDoubleInput("Enter your number:");
                    double b = Console.getDoubleInput("Enter your number::");
                    System.out.println(basic.calcMultiply(a, b));
                } else if (inputValue == 4) {
                    System.out.println("Division Time!");
                    double a = Console.getDoubleInput("Enter your number:");
                    double b = Console.getDoubleInput("Enter your number:");
                    if (a == 0 && b == 0) {
                        System.out.println("undefined");
                    } else if (b == 0) {
                        System.out.println("Error: To Infinity and Beyond!");
                    } else {
                        System.out.println(basic.calcDiv(a, b));
                    }
                }else if (inputValue == 5) {
                    System.out.println("Square Time!");
                    double a = Console.getDoubleInput("Enter your number:");
                    System.out.println(basic.calcSquared(a));
                } else if (inputValue == 6) {
                    System.out.println("Power Time!");
                    double a = Console.getDoubleInput("Enter your number:");
                    double b = Console.getDoubleInput("Enter your number:");
                    System.out.println(basic.calcToPower(a, b));
                } else if (inputValue == 7) {
                    System.out.println("Square Root Time!");
                    double a = Console.getDoubleInput("Enter your number:");
                    System.out.println(basic.calcSqrt(a));
                } else if (inputValue == 8) {
                    System.out.println("Inverse Time!");
                    double a = Console.getDoubleInput("Enter your number:");
                    System.out.println(basic.calcSqrt(a));
                } else if (inputValue == 9) {
                    System.out.println("Negative or Positive Time!");
                    double a = Console.getDoubleInput("Enter your number:");
                    System.out.println(basic.calcPosNeg(a));
                } else if (inputValue == 10) {
                    turnOn = false;
                    break;
                }
            }catch(Exception exception){
                    System.out.println("Incorrect input, please try again with a number");
                }
            }
        System.out.println("Goodbye :) !");
    }
}

//branch kai