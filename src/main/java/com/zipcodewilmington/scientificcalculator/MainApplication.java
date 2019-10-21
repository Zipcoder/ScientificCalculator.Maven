package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
//    private static String[] coreFunctions = {"set", "clear", "exit", "help"};
//    private static String[] coreMath = {"add", "subtract", "multiply", "divide"};
//    private static String[] sciMath = {};
    private static String helpText = "valid operations:\n\tset, clear, exit, help\n\tadd, subtract, multiply," +
        " divide, \n\tinverse, invert sign, square, sqrt, exp\n\tsine, cosine, tangent, csc, sec, cot, \n\tlog, log1p, log10, unit" +
        "\n\tm+, mc, mrc\n\tdisp, disp bin, disp oct, disp dec, disp \n\tscrabble";

    private static boolean calcOn = true;
    private static boolean showHelpText = false;

    private static String currentState = "0";
    private static String currentOperation = "none";
    private static double currentMemory = 0;
    private static String currentDisplayMode = "decimal";
    private static Boolean unitModeRadians = true; //false = degrees

    public static void main(String[] args) throws Exception {
        startUpMessage(); // prints welcome message to console and awaits input

        while (calcOn == true) {
            setDisplay();
            if (showHelpText) {
                Console.println(helpText);
                showHelpText = false;
            }
            // get operation from user input
            currentOperation = Console.getStringInput("Enter your operation: ");
            executeOperation(currentOperation);
            checkErrorInState();
        } // end while


    } // end main method

    public static void startUpMessage() {
        Console.println("Welcome to my CLI Calculator!");
        Console.println("\ttype 'help' for list of valid operations");
        Console.println("\ttype 'exit' to exit CLI Calculator");
        Console.getStringInput("press enter to begin");
    }

    public static void checkErrorInState() {
        if (currentState.equals("Err") || currentState.contains("Infinity")) {
            currentState = "Err";
            setDisplay();
            Console.println("\n\tYou must clear the error before continuing");
            Console.println("\tChoose a new value to reset the number in the display");
            currentState = String.valueOf(Console.getDoubleInput("Please enter a valid number: "));
        }
    }

    public static void setDisplay() {
        String value;
        if (currentState != "Err") {
            value = SciCalculator.convertNumberToMode(currentState, currentDisplayMode);
        } else {
            value = "Err";
        }
        Console.clear();
        Console.println("CLI Scientific Calculator");
        Console.println("unit_mode = " + checkUnitMode(unitModeRadians));
        Console.println("Mode: \t\t\t\t" + currentDisplayMode);
        Console.println("Value:\t\t\t\t" + value);
        Console.println("Previous operation:\t" + currentOperation + "\n");
    }

    public static String checkUnitMode(boolean mode) {
        String unit_mode;
        if (mode) {
            unit_mode = "rad";
        } else {
            unit_mode = "deg";
        }
        return unit_mode;
    }

    public static void executeOperation(String operation) throws Exception {
        checkErrorInState();
        executeCoreOperation(operation);
        executeMathOperation(operation);
        executeSciOperation(operation);
        executeExtraFeatures(operation);
    }

    public static void executeCoreOperation(String operation) {
        if (operation.equals("set")) {
            // prompt user to set currentState
            currentState = Console.getStringInput("Enter a number, x = ");
        }
        else if (operation.equals("clear")) {
            Console.clear();
        }
        else if (operation.equals("exit")) {
            calcOn = false;
        }
        else if (operation.equals("help")) {
            showHelpText = true;
        }
        else if (operation.contains("disp")) {
            currentDisplayMode = SciCalculator.switchDisplayMode(currentDisplayMode, operation);
        }
        else if (operation.equals("unit")) {
            unitModeRadians = !unitModeRadians;
        }
    }

    public static void executeMathOperation(String operation) {
        double x = Double.valueOf(currentState);
        double y;

        if (operation.equals("add")) {
            Console.println("f(y) = " + currentState + " + y");
            y = Console.getDoubleInput("y = ");
            currentState = Calculator.add(x, y);
        }
        else if (operation.equals("subtract")) {
            Console.println("f(y) = " + currentState + " - y");
            y = Console.getDoubleInput("y = ");
            currentState = Calculator.subtract(x, y);
        }
        else if (operation.equals("multiply")) {
            Console.println("f(y) = " + currentState + " * y");
            y = Console.getDoubleInput("y = ");
            currentState = Calculator.multiply(x, y);
        }
        else if (operation.equals("divide")) {
            Console.println("f(y) = " + currentState + " / y");
            y = Console.getDoubleInput("y = ");
            currentState = Calculator.divide(x, y);
        }
        else if (operation.equals("square")) {
            currentState = Calculator.square(x);
        }
        else if (operation.equals("sqrt")) {
            currentState = Calculator.sqrt(x);
        }
        else if (operation.equals("inverse")) {
            currentState = Calculator.inverse(x);
        }
        else if (operation.equals("invert sign")) {
            currentState = Calculator.invertSign(x);
        }
        else if (operation.equals("exp")) {
            Console.println("f(y) = " + currentState + "^y");
            y = Console.getDoubleInput("y = ");
            currentState = Calculator.exp(x, y);
        }

    }

    public static void executeSciOperation(String operation) {
        checkErrorInState();
        double x;
        x = Double.valueOf(currentState);

        if (operation.equals("m+")) {
            Console.println(currentState + " saved to memory");
            currentMemory = Double.valueOf(currentState);
        }
        else if (operation.equals("mc")) {
            Console.println("memory reset to zero");
            currentMemory = 0;
        }
        else if (operation.equals("mrc")) {
            Console.println(currentMemory + " recalled from memory");
            currentState = String.valueOf(currentMemory);
        }
        else if (operation.equals("sine")) {
            currentState = SciCalculator.sine(x, unitModeRadians);
        } else if (operation.equals("cosine")) {
            currentState = SciCalculator.cosine(x, unitModeRadians);
        } else if (operation.equals("tangent")) {
            currentState = SciCalculator.tangent(x, unitModeRadians);
        } else if (operation.equals("csc")) {
            currentState = SciCalculator.csc(x, unitModeRadians);
        } else if (operation.equals("sec")) {
            currentState = SciCalculator.sec(x, unitModeRadians);
        } else if (operation.equals("cotan")) {
            currentState = SciCalculator.cotan(x, unitModeRadians);
        }
        else if (operation.equals("log")) { //**Fix these
            currentState = SciCalculator.log(x);
        }
        else if (operation.equals("log10")) { //**Fix these
            currentState = SciCalculator.log10(x);
        }
        else if (operation.equals("log1p")) { //**Fix these
            currentState = SciCalculator.log1p(x);
        }
        else if (operation.equals("factorial")) {
            currentState = SciCalculator.factorial(x);
        }
        else if (operation.equals("date") || operation.equals("time")){
            ExtraFeature.dateAndTime();
        }
    }
    public static void executeExtraFeatures(String operation) throws Exception {
        if (operation.equals("scrabble")) {
            String query = Console.getStringInput("type up to seven letters to return best scoring scrabble words: ");
            String response = ExtraFeature.getBestScoringWords(query.toUpperCase());
            Console.println(response);
            Console.getStringInput("press enter to return to calculator");
        }
    }
}
