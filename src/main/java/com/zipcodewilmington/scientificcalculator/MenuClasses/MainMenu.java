package com.zipcodewilmington.scientificcalculator.MenuClasses;

import com.zipcodewilmington.scientificcalculator.Console;
import com.zipcodewilmington.scientificcalculator.DisplayModeClasses.DisplayMode;
import com.zipcodewilmington.scientificcalculator.Memory;

public class MainMenu {

    static Integer input;



    public static void mainMenu() {

        Double currentNum = Console.getDoubleInput("\nWhat's your first number?\n\n");

        input = Console.getIntegerInput(
                "\nWhat would you like to do with this number? Input a number and press enter to select an operation.\n\n" +
                        "1. Arithmetic \n" +
                        "2. Trigonometry \n" +
                        "3. Exponents \n" +
                        "4. Logarithms \n" +
                        "5. Inversions \n" +
                        "6. Miscellaneous \n" +
                        "7. M+ \n" +
                        "8. MRC \n" +
                        "9. MC \n" +
                        "10. Rotate Display Mode \n" +
                        "11. Pick Display Mode \n" +
                        "12. Exit \n");

        MainMenu.getSubMenu(input, currentNum);
    }

    public static void mainMenu(Double trackedNum) {

        input = Console.getIntegerInput(
                "\nWhat would you like to do with this number? Input a number and press enter to select an operation.\n\n" +
                        "1. Arithmetic \n" +
                        "2. Trigonometry \n" +
                        "3. Exponents \n" +
                        "4. Logarithms \n" +
                        "5. Inversions \n" +
                        "6. Miscellaneous \n" +
                        "7. M+ \n" +
                        "8. MRC \n" +
                        "9. MC \n" +
                        "10. Rotate Display Mode \n" +
                        "11. Pick Display Mode \n" +
                        "12. Exit \n");

        MainMenu.getSubMenu(input, trackedNum);
    }

    public static void getSubMenu(Integer input, Double currentNum) {

        switch (input) {
            case 1:
                Submenu.arithmeticMenu(currentNum);
                break;
            case 2:
                Submenu.trigonometryMenu(currentNum);
                break;
            case 3:
                Submenu.exponentsMenu(currentNum);
                break;
            case 4:
                Submenu.logarithmsMenu(currentNum);
                break;
            case 5:
                Submenu.inversionMenu(currentNum);
                break;
            case 6:
                Submenu.miscMenu(currentNum);
                break;
            case 7:
                Memory.memorySave();
                MainMenu.mainMenu(currentNum);
                break;
            case 8:
                Memory.memoryReturn();
                MainMenu.mainMenu(currentNum);
                break;
            case 9:
                Memory.memoryClear();
                MainMenu.mainMenu(currentNum);
                break;
            case 10:
                DisplayMode.switchDisplayMode();
                MainMenu.mainMenu(currentNum);
                break;
            case 11:
                String modeInput = Console.getStringInput("Enter a display mode.");
                DisplayMode.switchDisplayMode(modeInput);
                MainMenu.mainMenu(currentNum);
                break;
            case 12:
                Console.println("Bye!");
                System.exit(0);
                break;
            default:
                Console.println("\nInvalid selection. Please try again.");
                MainMenu.mainMenu(currentNum);
        }

    }

}

