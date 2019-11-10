package com.zipcodewilmington.scientificcalculator.OperationClasses;

import com.zipcodewilmington.scientificcalculator.Console;
import com.zipcodewilmington.scientificcalculator.DisplayModeClasses.DisplayMode;
import com.zipcodewilmington.scientificcalculator.Inversion;
import com.zipcodewilmington.scientificcalculator.MenuClasses.MainMenu;
import com.zipcodewilmington.scientificcalculator.MenuClasses.Submenu;

public class Operations {

static Double num2;

    public static void performArithmeticOperation(Integer selection, Double currentNum) {

        switch (selection) {
            case 1:
                num2 = Console.getDoubleInput("Enter another number.");
                currentNum = Arithmetic.addition(currentNum, num2);
                Console.println("\n");
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
                break;
            case 2:
                num2 = Console.getDoubleInput("Enter a another number.");
                currentNum = Arithmetic.subtraction(currentNum, num2);
                Console.println("\n");
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
                break;
            case 3:
                num2 = Console.getDoubleInput("Enter a another number.");
                currentNum = Arithmetic.multiplication(currentNum, num2);
                Console.println("\n");
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
                break;
            case 4:
                num2 = Console.getDoubleInput("Enter a another number.");
                currentNum = Arithmetic.division(currentNum, num2);
                Console.println("\n");
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
                break;
            case 5:
                Submenu.arithmeticMenu(currentNum);
                break;
            case 6:
                MainMenu.mainMenu(currentNum);
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                Submenu.arithmeticMenu(currentNum);

        }

    }

    public static void performTrigonometryOperation (Integer selection, Double currentNum) {

        switch (selection) {
            case 1:
                currentNum = DisplayMode.convertInputToSelectedMode(currentNum);
                currentNum = Trigonometry.tangent(currentNum);
                Console.println("\n");
                DisplayMode.convertOutputToSelectedMode(currentNum);
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
                break;
            case 2:
                currentNum = DisplayMode.convertInputToSelectedMode(currentNum);
                currentNum = Trigonometry.sine(currentNum);
                Console.println("\n");
                DisplayMode.convertOutputToSelectedMode(currentNum);
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
                break;
            case 3:
                currentNum = DisplayMode.convertInputToSelectedMode(currentNum);
                currentNum = Trigonometry.cosine(currentNum);
                Console.println("\n");
                DisplayMode.convertOutputToSelectedMode(currentNum);
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
                break;
            case 4:
                currentNum = DisplayMode.convertInputToSelectedMode(currentNum);
                currentNum = Trigonometry.atangent(currentNum);
                Console.println("\n");
                DisplayMode.convertOutputToSelectedMode(currentNum);
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
                break;
            case 5:
                currentNum = DisplayMode.convertInputToSelectedMode(currentNum);
                currentNum = Trigonometry.acos(currentNum);
                Console.println("\n");
                DisplayMode.convertOutputToSelectedMode(currentNum);
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
                break;
            case 6:
                currentNum = DisplayMode.convertInputToSelectedMode(currentNum);
                currentNum = Trigonometry.asin(currentNum);
                Console.println("\n");
                DisplayMode.convertOutputToSelectedMode(currentNum);
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
                break;
            case 7:
                DisplayMode.rotateInputBetweenRadsDegs();
                Submenu.trigonometryMenu(currentNum);
                break;
            case 8:
                DisplayMode.rotateOutputBetweenRadsDegs();
                Submenu.trigonometryMenu(currentNum);
                break;
            case 9:
                String trigInputMode = Console.getStringInput("Type radians or degrees to switch your input mode to that type.");
                DisplayMode.switchInputBetweenRadsDegs(trigInputMode);
                break;
            case 10:
                String trigOutputMode = Console.getStringInput("Type radians or degrees to switch your output mode to that type.");
                DisplayMode.switchOutputBetweenRadsDegs(trigOutputMode);
                break;
            case 11:
                Submenu.trigonometryMenu(currentNum);
                break;
            case 12:
                MainMenu.mainMenu(currentNum);
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                Submenu.trigonometryMenu(currentNum);
        }

    }

    public static void performExponentOperation (Integer selection, Double currentNum) {

        switch (selection) {
            case 1:
                currentNum = Exponents.square(currentNum);
                Console.println("\n");
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
                break;
            case 2:
                currentNum = Exponents.cubed(currentNum);
                Console.println("\n");
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
                break;
            case 3:
                num2 = Console.getDoubleInput("Enter a number to raise this to.");
                currentNum = Exponents.variableExponent(currentNum, num2);
                Console.println("\n");
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
                break;
            case 4:
                currentNum = Exponents.sqrt(currentNum);
                Console.println("\n");
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
            case 5:
                Submenu.exponentsMenu(currentNum);
                break;
            case 6:
                MainMenu.mainMenu(currentNum);
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                Submenu.exponentsMenu(currentNum);
        }

    }

    public static void performInversionOperation (Integer selection, Double currentNum) {

        switch (selection) {
            case 1:
                currentNum = Inversion.changeSign(currentNum);
                Console.println("\n");
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
                break;
            case 2:
                currentNum = Inversion.inverseNum(currentNum);
                Console.println("\n");
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
                break;
            case 3:
                MainMenu.mainMenu(currentNum);
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                Submenu.inversionMenu(currentNum);
        }

    }

    public static void performLogarithmOperation (Integer selection, Double currentNum) {

        switch (selection) {
            case 1:
                currentNum = Logarithmic.naturalLog(currentNum);
                Console.println("\n");
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
                break;
            case 2:
                currentNum = Logarithmic.logBaseTen(currentNum);
                Console.println("\n");
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                Submenu.logarithmsMenu(currentNum);
        }

    }

    public static void performMiscOperation (Integer selection, Double currentNum) {

        switch (selection) {
            case 1:
                currentNum = Misc.absVal(currentNum);
                Console.println("\n");
                Console.println(DisplayMode.convertToSelectedMode(currentNum));
                MainMenu.mainMenu(currentNum);
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                Submenu.miscMenu(currentNum);
        }
    }


}