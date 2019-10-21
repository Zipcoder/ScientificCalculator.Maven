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

    public static void clear() {
        print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        print(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        print(prompt);
        Integer userInput = scanner.nextInt();
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        Boolean check = false;
        do {
            print(prompt);
            userInput = scanner.nextLine();
            check = userInput.matches("^-?\\d+(\\.\\d*)?$");

        } while (!check);

        return Double.valueOf(userInput);
    }
}
