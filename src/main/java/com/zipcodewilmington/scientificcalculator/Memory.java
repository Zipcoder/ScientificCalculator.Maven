package com.zipcodewilmington.scientificcalculator;

public class Memory {
static Double savedValue;

    public static void memorySave() {
       savedValue = Console.getDoubleInput("Enter the number you want to save and press enter.");
    }

    public static void memoryClear() {
        savedValue = null;
        Console.println("\n Memory cleared.");

    }

    public static void memoryReturn() {
        Console.println("\n" + savedValue);
    }
}
