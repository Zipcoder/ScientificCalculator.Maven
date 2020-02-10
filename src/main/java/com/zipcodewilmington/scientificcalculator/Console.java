package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner strScanner = new Scanner(System.in);
        println(prompt);
        String strInput = strScanner.nextLine();
        return strInput;
    }

    public static String evalMenuOption(String m){
            if (m.equals("A")) {
                println("your string is " + m);
            } else if (m.equals("B")) {
                println("your string is " + m);
            } else {
                println("Invalid Input! Please type A for Integer or B for Double");
                println("your string is " + m);
            }
            return m;
    }

    public static double getDoubleInput(String prompt) {
        Scanner doubleScanner = new Scanner(System.in);
        println(prompt);
        while (!doubleScanner.hasNextDouble()) {
            doubleScanner.next();
            println("Invalid Input! Please enter a Double.");
        }
        double doubleInput = doubleScanner.nextDouble();

        return doubleInput;
    }
}
