package com.zipcodewilmington.scientificcalculator;
import java.util.InputMismatchException;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        double currentlyDisplayed = 0;
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
                        double secondNum = Console.getDoubleInput("Please enter your second number:");
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
                        double secondNum = Console.getDoubleInput("Please enter your second number:");
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
            //memory add
            else if(op.equalsIgnoreCase("m+")){
                myCalc.memAdd(currentlyDisplayed);
                String message = currentlyDisplayed + " added to memory";
                myCalc.drawScreen(message);
            }
            //memory clear
            else if(op.equalsIgnoreCase("mc")){
                myCalc.memClear();
                String message = "Memory reset to 0";
                myCalc.drawScreen(message);
            }
            //memory recall
            else if(op.equalsIgnoreCase("mrc")){
                currentlyDisplayed = myCalc.memRecall();
                myCalc.drawScreen(Double.toString(currentlyDisplayed));

                //conversions
            } else if (op.equalsIgnoreCase("dectobinary")) {
                String stringBinary = myCalc.decimalToBinary(currentlyDisplayed);
                currentlyDisplayed = Double.parseDouble(stringBinary);
                myCalc.drawScreen(stringBinary);
            } else if (op.equalsIgnoreCase("dectohex")) {
                String stringBinary = myCalc.decimalToHex(currentlyDisplayed);
                currentlyDisplayed = Double.parseDouble(stringBinary);
                myCalc.drawScreen(stringBinary);
            } else if (op.equalsIgnoreCase("dectooct")) {
                double stringBinary = myCalc.decimalToOct(currentlyDisplayed);
                String strDecToOct = String.valueOf(stringBinary);
                myCalc.drawScreen(strDecToOct);
            } else if (op.equalsIgnoreCase("octtohex")) {
                double stringOctToHex = myCalc.octalToHex(currentlyDisplayed);
                String stringToHex = String.valueOf(stringOctToHex);
                myCalc.drawScreen(stringToHex);
            } else if (op.equalsIgnoreCase("octtobinary")) {
                double numOctToBinary = myCalc.octalToBinary(currentlyDisplayed);
                String stringToBinary = String.valueOf(numOctToBinary);
                myCalc.drawScreen(stringToBinary);
            } else if (op.equalsIgnoreCase("octtodec")) {
                double octToDec = myCalc.octalToDecimal(currentlyDisplayed);
                String stringToDecimal = String.valueOf(octToDec);
                myCalc.drawScreen((stringToDecimal));
            } else if (op.equalsIgnoreCase("hexToBinary")) {
                double hexToBin = myCalc.hexToBinary(currentlyDisplayed);
                String stringToBinary = String.valueOf(hexToBin);
                myCalc.drawScreen(stringToBinary);
            } else if (op.equalsIgnoreCase("hextodec")) {
                double hexToDec = myCalc.hexToDecimal(currentlyDisplayed);
                String stringToDecimal = String.valueOf(hexToDec);
                myCalc.drawScreen(stringToDecimal);
            }else if (op.equalsIgnoreCase("hextooct")) {
                double hexToOct = myCalc.hexToOctal(currentlyDisplayed);
                String stringToOct = String.valueOf(hexToOct);
                myCalc.drawScreen(stringToOct);
            } else if (op.equalsIgnoreCase("binaryToDec")) {
                double binToDec = myCalc.binToDec(currentlyDisplayed);
                String stringToDec = String.valueOf(binToDec);
                myCalc.drawScreen(stringToDec);
            } else if (op.equalsIgnoreCase("binaryToOct")) {
                double bitToOct = myCalc.binaryToOct(currentlyDisplayed);
                String stringToOct = String.valueOf(bitToOct);
                myCalc.drawScreen(stringToOct);
            } else if (op.equalsIgnoreCase("binaryToHex")) {
                double bitToHex = myCalc.binaryToHex(currentlyDisplayed);
                String stringToHex = String.valueOf(bitToHex);
                myCalc.drawScreen(stringToHex);

                //Clear screen
            }else if (op.equalsIgnoreCase("clear")) {
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
}