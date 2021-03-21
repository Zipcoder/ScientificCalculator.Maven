package com.zipcodewilmington.scientificcalculator;
import java.util.InputMismatchException;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static double currentlyDisplayed;

    public static void main(String[] args) {
        boolean isRunning = true;

        Calculator myCalc = new Calculator();
        myCalc.drawScreen(Double.toString(currentlyDisplayed));
        Console.println("Welcome to my calculator!");
        while(true) {
            try {
                currentlyDisplayed = Console.getDoubleInput("Please enter your first number:");
                break;
            } catch (InputMismatchException e) {
                Console.println("");
            }
        }
        myCalc.drawScreen(Double.toString(currentlyDisplayed));
        while(isRunning) {
            String op = Console.getStringInput("Please enter the operation you would like to perform:");
            //prompt user for second number if they choose two variable operator then run two variable operator
            if (op.equalsIgnoreCase("add") || op.equalsIgnoreCase("subtract") || op.equalsIgnoreCase("multiply") || op.equalsIgnoreCase("exponential")) {
                while(true){
                    try{
                        double secondNum = Console.getDoubleInput("Please enter your second number or enter \"Memory\" for your stored value:");
                        currentlyDisplayed = myCalc.performOperation(op,currentlyDisplayed, secondNum);
                        myCalc.drawScreen(Double.toString(currentlyDisplayed));
                        break;
                    }
                    catch(InputMismatchException e) {
                        Console.println("");
                    }
                }
            }
            //handle division by zero
            else if  (op.equalsIgnoreCase("divide")){
                while(true){
                    try{
                        double secondNum = Console.getDoubleInput("Please enter your second number or enter \"Memory\" for your stored value:");
                        if (secondNum == 0) {
                            String error = "Can't divide by zero";
                            myCalc.drawScreen(error);
                        }
                        else {
                            currentlyDisplayed = myCalc.performOperation(op, currentlyDisplayed, secondNum);
                            myCalc.drawScreen(Double.toString(currentlyDisplayed));
                        }
                        break;
                    }
                    catch(InputMismatchException e) {
                        Console.println("");
                    }
                }
            }
            //run one variable operator
            else if (op.equalsIgnoreCase("square") || op.equalsIgnoreCase("square root") || op.equalsIgnoreCase("inverse") || op.equalsIgnoreCase("log")|| op.equalsIgnoreCase("log-1")|| op.equalsIgnoreCase("ln")|| op.equalsIgnoreCase("ln-1")|| op.equalsIgnoreCase("sine")|| op.equalsIgnoreCase("cosine")|| op.equalsIgnoreCase("tangent")|| op.equalsIgnoreCase("factorial")|| op.equalsIgnoreCase("sine-1")|| op.equalsIgnoreCase("cosine-1")|| op.equalsIgnoreCase("tangent-1")|| op.equalsIgnoreCase("invert")|| op.equalsIgnoreCase("ctof")|| op.equalsIgnoreCase("ftoc")|| op.equalsIgnoreCase("lbtokg")|| op.equalsIgnoreCase("kgtolb")|| op.equalsIgnoreCase("radtodeg")|| op.equalsIgnoreCase("degtorad")){
                currentlyDisplayed = myCalc.performOperation(op, currentlyDisplayed);
                myCalc.drawScreen(Double.toString(currentlyDisplayed));
            }
            //clear screen
            else if (op.equalsIgnoreCase("clear")) {
                currentlyDisplayed = 0;
                myCalc.drawScreen(Double.toString(currentlyDisplayed));
            }
            else if(op.equalsIgnoreCase("set")){
                double setNum = Console.getDoubleInput("Please enter your number to set:");
                currentlyDisplayed = setNum;
                myCalc.drawScreen(Double.toString(currentlyDisplayed));
            }
            //quit calc
            else if(op.equalsIgnoreCase("quit")){
                isRunning = false;
            }
            //handle misspelled operator
            else{
                String error = "Invalid operator";
                myCalc.drawScreen(error);
            }
        }
    }

    public static double getCurrent(){
        return currentlyDisplayed;
    }

}