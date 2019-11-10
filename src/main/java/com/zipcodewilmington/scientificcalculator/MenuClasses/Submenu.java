package com.zipcodewilmington.scientificcalculator.MenuClasses;

import com.zipcodewilmington.scientificcalculator.Console;
import com.zipcodewilmington.scientificcalculator.OperationClasses.Operations;

public class Submenu {

    public static void arithmeticMenu(Double currentNum) {

        Integer input2 = Console.getIntegerInput(
                "Pick an operation by entering a number and pressing enter. \n" +
                        "1. Add \n" +
                        "2. Subtract \n" +
                        "3. Multiply \n" +
                        "4. Divide \n" +
                        "5. Return to Arithmetic Menu \n" +
                        "6. Return to Main Menu \n");

        Operations.performArithmeticOperation(input2, currentNum);


    }

    public static void trigonometryMenu(Double currentNum) {

        Integer input2 = Console.getIntegerInput(
                "Pick an operation by entering a number and pressing enter.\n" +
                        "1. Tangent\n" +
                        "2. Sine\n" +
                        "3. Cosine\n" +
                        "4. Inverse Tangent\n" +
                        "5. Inverse Cosine\n" +
                        "6. Inverse Sine\n" +
                        "7. Rotate Input Mode\n" +
                        "8. Rotate Output Mode\n" +
                        "9. Pick Input Mode\n" +
                        "10. Pick Output Mode\n" +
                        "11. Return to Trig Menu\n" +
                        "12. Return to Main Menu\n");

        Operations.performTrigonometryOperation(input2, currentNum);


    }

    public static void exponentsMenu(Double currentNum) {

        Integer input2 = Console.getIntegerInput(
                "Pick an operation by entering a number and pressing enter. \n" +
                        "1. Square \n" +
                        "2. Cube \n" +
                        "3. Variable Exponent \n" +
                        "5. Square Root \n" +
                        "4. Return to Exponent Menu \n" +
                        "5. Return to Main Menu \n");

        Operations.performExponentOperation(input2, currentNum);


    }

    public static void inversionMenu(Double currentNum) {

        Integer input2 = Console.getIntegerInput(
                "Pick an operation by entering a number and pressing enter. \n" +
                        "1. Invert Sign \n" +
                        "2. 1 / x \n" +
                        "3. Return to Main Menu \n");

        Operations.performInversionOperation(input2, currentNum);


    }

    public static void miscMenu(Double currentNum) {

        Integer input2 = Console.getIntegerInput(
                "Pick an operation by entering a number and pressing enter. \n" +
                        "1. Absolute Value \n"
                        //"2.  \n" +
                        //"3.  \n"
                        );

        Operations.performMiscOperation(input2, currentNum);


    }

    public static void logarithmsMenu(Double currentNum) {
        Integer input2 = Console.getIntegerInput(
                "Pick an operation by entering a number and pressing enter. \n" +
                        "1. Natural Log \n" +
                        "2. Log Base 10 \n"
                //"3.  \n"
        );
        Operations.performLogarithmOperation(input2, currentNum);
    }

}