package com.zipcodewilmington.scientificcalculator;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class MainApplication {
    public static void main(String[] args) {

        Calculator c = new Calculator();                                        //create a instance of Calculator
        NumberFormat nf = new DecimalFormat("0.#####################"); //this is for better number display

        double cur = 0.0;       //current number displayed right now
        double curTemp = 0.0;   //previous current number
        double mem = 0;         //memory
        String result = "";     //handles text result


        int[] modeType = {10, 2, 8, 16};
        String[] modeName = {"Decimal", "Binary", "Octal", "Hexadecimal"};
        int modeI = 0;          //calculator mode


        Console.println("**==================================================**");
        Console.println("     !!!!  Welcome to Calculator by Team 3  !!!!");
        Console.println("**==================================================**");


        //Main loop starts here, the loop will break only when user enter 'bye'
        //It will check user input and prints according result in each iteration.
        while (true) {
            curTemp = cur;  //store the a backup current for later use

            //if I am not in decimal mode, I will convert current value to other mode and
            //print some message telling user which mode they are in
            if (modeI != 0) {
                Console.println("[ " + modeName[modeI] + " Mode ] (Any decimal point will be truncated)");
                Console.println("Current Value: " + c.DecimalToOther((int) cur, modeType[modeI]));
            } else {
                //if it's decimal mode just print regularly
                Console.println("Current Value: " + nf.format(cur));
            }

            //gets user input
            String command = Console.getStringInput("Please enter a command! (Enter HELP for user manual) ");

            //check if it is needed to ask for another number:
            if (command.equalsIgnoreCase("add") || command.equalsIgnoreCase("sub") ||
                    command.equalsIgnoreCase("mul") || command.equalsIgnoreCase("div")
                    || command.equalsIgnoreCase("pow") || command.equalsIgnoreCase("set")) {


                double num1 = Console.getDoubleInput("Please enter a number: ");

                if (command.equalsIgnoreCase("add")) {
                    cur = c.add(cur, num1);
                } else if (command.equalsIgnoreCase("sub")) {
                    cur = c.subtract(cur, num1);
                } else if (command.equalsIgnoreCase("mul")) {
                    cur = c.multiply(cur, num1);
                } else if (command.equalsIgnoreCase("div")) {
                    cur = c.divide(cur, num1);
                } else if (command.equalsIgnoreCase("pow")) {
                    cur = c.exponent(cur, num1);
                } else if (command.equalsIgnoreCase("set")) {
                    cur = num1;
                }

            } else if (command.equalsIgnoreCase("useM")) {
                cur = mem;
            } else if (command.equalsIgnoreCase("M+")) {
                mem += cur;
                Console.println("OK! I added " + nf.format(cur) + " to memory! Memory is now " + nf.format(mem));
            } else if (command.equalsIgnoreCase("clearM")) {
                mem = 0;
                Console.println("OK! I reset the memory, memory is now " + nf.format(mem));
            } else if (command.equalsIgnoreCase("showM")) {
                Console.println("M is " + nf.format(mem));
            } else if (command.equalsIgnoreCase("M")) {
                mem = cur;
                Console.println("OK! Memory is now set to " + nf.format(mem));
            } else if (command.equalsIgnoreCase("BYE")) {
                break;
            } else if (command.equalsIgnoreCase("zipcode")) {
                Console.println("Cohort 6.0 is the BEST COHORT EVER!!!!!");
            } else {

                if (command.equalsIgnoreCase("neg")) {
                    cur = c.signSwitch(cur);
                } else if (command.equalsIgnoreCase("inv")) {
                    cur = c.inverse(cur);
                } else if (command.equalsIgnoreCase("sq")) {
                    cur = c.square(cur);
                } else if (command.equalsIgnoreCase("sqrt")) {
                    cur = c.squareRoot(cur);
                } else if (command.equalsIgnoreCase("sin")) {
                    cur = c.sin(cur);
                } else if (command.equalsIgnoreCase("cos")) {
                    cur = c.cos(cur);
                } else if (command.equalsIgnoreCase("tan")) {
                    cur = c.tangent(cur);
                } else if (command.equalsIgnoreCase("arcsin")) {
                    cur = c.InverseSin(cur);
                } else if (command.equalsIgnoreCase("arccos")) {
                    cur = c.InverseCos(cur);
                } else if (command.equalsIgnoreCase("arctan")) {
                    cur = c.InverseTangent(cur);
                } else if (command.equalsIgnoreCase("ln")) {
                    cur = c.log(cur);
                } else if (command.equalsIgnoreCase("log10")) {
                    cur = c.log10X(cur);
                } else if (command.equalsIgnoreCase("invlog")) {
                    cur = c.invLog(cur);
                } else if (command.equalsIgnoreCase("ex")) {
                    cur = c.invNatLog(cur);
                } else if (command.equalsIgnoreCase("!")) {
                    cur = c.factorial(cur);
                } else if (command.equalsIgnoreCase("toDeg")) {
                    cur = c.toDegrees(cur);
                } else if (command.equalsIgnoreCase("toRad")) {
                    cur = c.toRadians(cur);
                } else if (command.equalsIgnoreCase("toHex")) {
                    result = c.DecimalToOther((int) cur, 16);
                } else if (command.equalsIgnoreCase("toOct")) {
                    result = c.DecimalToOther((int) cur, 8);
                } else if (command.equalsIgnoreCase("toBin")) {
                    result = c.DecimalToOther((int) cur, 2);
                } else if (command.equalsIgnoreCase("always73")) {
                    if (cur == 0) {
                         Console.println("Sorry, this doesn't work on 0....:(");
                    }
                    else {
                        double a = c.multiply(cur, 10001);
                        double b = c.divide(a, 137);
                        double cc = c.divide(b, cur);

                        Console.println(cur + " * 10001 = " + a);
                        Console.println(a + " / 137 = " + b);
                        Console.println(b + " / " + cur + " = " + cc);
                        cur = c.secretof73(cur);
                    }
                } else if (command.equalsIgnoreCase("c")) {
                    cur = 0;
                } else if (command.equalsIgnoreCase("isPrime") || command.equalsIgnoreCase("mode16") ||
                        command.equalsIgnoreCase("mode10") || command.equalsIgnoreCase("mode8") ||
                        command.equalsIgnoreCase("mode2") || command.equalsIgnoreCase("mode2") ||
                        command.equalsIgnoreCase("help") || command.equalsIgnoreCase("mode")) {

                } else {
                    Console.println("That's not a valid command!!");
                }
            }


            //print result
            if (Double.isNaN(cur) || cur == Double.POSITIVE_INFINITY || cur == Double.NEGATIVE_INFINITY) {
                Console.println("ERROR!!! :(");
                cur = curTemp;
            } else if (command.equalsIgnoreCase("toHex")) {
                Console.println("Decimal " + (int) cur + " is " + result + " in Hexadecimal!");
            } else if (command.equalsIgnoreCase("toOct")) {
                Console.println("Decimal " + (int) cur + " is " + result + " in Octal!");
            } else if (command.equalsIgnoreCase("toBin")) {
                Console.println("Decimal " + (int) cur + " is " + result + " in Binary!");
            } else if (command.equalsIgnoreCase("isPrime")) {
                if (c.isPrime(cur))
                    Console.println((int) cur + " is a prime");
                else {
                    Console.println(nf.format(cur) + " is not a prime");
                }
            } else if (command.equalsIgnoreCase("mode")) {
                //if user is using hex mode and called this, the program will switch back to decimal
                if(modeI == modeType.length-1){
                    modeI = 0;
                }else{
                    modeI++;
                }
                Console.println("Ok! Switched to " + modeName[modeI] + " mode");
            } else if (command.equalsIgnoreCase("mode10")) {
                modeI = 0;
                Console.println("Ok! Switched to " + modeName[modeI] + " mode");
            } else if (command.equalsIgnoreCase("mode16")) {
                modeI = 3;
                Console.println("Ok! Switched to " + modeName[modeI] + " mode");
            } else if (command.equalsIgnoreCase("mode8")) {
                modeI = 2;
                Console.println("Ok! Switched to " + modeName[modeI] + " mode");
            } else if (command.equalsIgnoreCase("mode2")) {
                modeI = 1;
                Console.println("Ok! Switched to " + modeName[modeI] + " mode");
            } else if (command.equalsIgnoreCase("help")) {
                Console.print("Here are the available commends:\n" +
                        printHelp("Set Value", "set") +
                        printHelp("Clear Value", "c") +
                        printHelp("Add", "add") +
                        printHelp("Subtract", "sub") +
                        printHelp("Multiply", "mul") +
                        printHelp("Divide", "div") +
                        printHelp("Exponent", "pow") +
                        printHelp("Switch Sign", "neg") +
                        printHelp("Inverse", "inv") +
                        printHelp("Sine", "sin") +
                        printHelp("Cosine", "cos") +
                        printHelp("Tangent", "tan") +
                        printHelp("Inverse Sine", "arcsin") +
                        printHelp("Inverse Cosine", "arccon") +
                        printHelp("Inverse Tangent", "arctan") +
                        printHelp("Logarithm", "log10") +
                        printHelp("Inverse Log", "invlog") +
                        printHelp("Natural Log ", "ln") +
                        printHelp("Inverse Natural Log", "ex") +
                        printHelp("Inverse number", "inv") +
                        printHelp("Square", "sq") +
                        printHelp("Square Root", "sqrt") +
                        printHelp("Factorial", "!") +
                        printHelp("Degree to Radian", "toRad") +
                        printHelp("Radian to Degree", "toDeg") +
                        printHelp("Next Mode", "mode") +
                        printHelp("Hexadecimal Mode", "mode16") +
                        printHelp("Decimal Mode", "mode10") +
                        printHelp("Octal Mode", "mode8") +
                        printHelp("Binary Mode", "mode2") +
                        printHelp("Set memory", "M") +
                        printHelp("Add value to memory", "M+") +
                        printHelp("Show value in memory", "showM") +
                        printHelp("Use the value in memory", "useM") +
                        printHelp("Clear memory", "clearM") +
                        printHelp("Help mode", "help")
                );
            } else {
                String d = "";
                if (modeI != 0) {
                    d = "decimal ";
                }
                Console.println("Your " + d + "result is " + nf.format(cur) + " :)");
            }

            Console.println("-------------------------------------------------------");

        }
    }

    public static String printHelp(String description, String ops) {
        return String.format("%-27s%s\n", description, ops).replace(' ', '-');
    }
}
