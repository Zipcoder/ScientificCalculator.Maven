package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {


    public static void main(String[] args) {
        boolean turnOn = true;
        //make a list of basic commands for calulator
        String[] basicCommands = {"run calculator", "clear display", "print current number", "switch trig units",
                "switch display mode", "erase memory", "turn off"};
        //turn that array into a string
        List<String> basicCommandsList = Arrays.asList(basicCommands);
        //call the scanner
        Scanner scanner = new Scanner(System.in);
        //welcome the user
        System.out.println("Hello! Welcome to the calculator main menu!\nWould you care for a drink?\n\n");


        while (turnOn) {
            System.out.println("What would you like to do?\nType \"cmd\" for commands.");
            String userCommand = scanner.nextLine();

            while (!basicCommandsList.contains(userCommand)) {
                if (userCommand.equals("cmd")) {
                    System.out.println("*\"run calculator\" - Run the Calculator*");
                    System.out.println("*\"turn off\" - Turn Off the Calculator*");
                    System.out.println("*Other list of commands UPCOMING!*\n");
                } else if (basicCommandsList.contains(userCommand)) {
                    break;
                } else {
                    System.out.println("ERROR: Invalid command.\n");
                }
                System.out.println("What would you like to do?\nType \"cmd\" for commands.");
                userCommand = scanner.nextLine();
            }

            switch (userCommand) {
                case "run calculator":
                    Calculator calculator = new Calculator();
                    calculator.runCalculator();
                    break;
                case "turn off":
                    turnOn = false;
                    break;
            }
        }
        System.out.println("Goodbye! Have a nice day!");
    }
}