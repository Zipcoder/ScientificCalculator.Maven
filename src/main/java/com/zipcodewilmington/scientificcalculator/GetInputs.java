package com.zipcodewilmington.scientificcalculator;

public class GetInputs {

    public Double getx(double x, String prompt){

        int i = 0;
        while (i == 0) {

            try {
                if (x == 0) {
                    x = Console.getDoubleInput(prompt);
                }
                i = 1;
            } catch (Exception e) {
                Console.println("Please enter a number");
            }
        }
        return x;
    }

    public Double gety(String prompt){

        double y = 0;
        boolean i = true;

        while (i) {
            try {
                y = Console.getDoubleInput(prompt);
                i = false;
            }
            catch (Exception e) {
                Console.println("Please enter a number");
            }
        }
        return y;
    }
}
