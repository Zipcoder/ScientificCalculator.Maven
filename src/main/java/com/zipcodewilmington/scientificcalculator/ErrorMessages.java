package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.MenuClasses.Submenu;

public class ErrorMessages {

    public static String errorMessage(Double d, Double d2, Integer s1) {

        if(d2 == 0 && s1 == 4) {
                Console.println("You cannot divide by 0. \n");
                Submenu.arithmeticMenu(d);

        } else if (d <0) {
            Console.println("You cannot find the square root of a negative number.");

        }
        return null;
    }

    public static void invalidSelection() {
        Console.println("Invalid option. Please try again.");
    }

    public static void noInverseZero(Double a)
    {
        if (a == 0)
        {
           Console.println("You cannot divide by 0. \n");
            Submenu.inversionMenu(a);
        }

    }

}
