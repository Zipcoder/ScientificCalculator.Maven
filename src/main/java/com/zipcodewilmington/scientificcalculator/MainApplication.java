package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        //initial setup of fields
        Double currentDouble = 0.00;
        String currentString = "";
        Double y;

        //creating instances of classes
        BasicCalculator basicCalc = new BasicCalculator();
        ScientificCalculator sciencecalc = new ScientificCalculator();
        MemoryAndSettings memoryandSettings = new MemoryAndSettings();
        GetInputs getInputs = new GetInputs();
        Console console = new Console();

        String s = "";

        console.print("Welcome to my calculator!\n" +
                        "Type 'help' for list of commands.\n" +
                        "What would you like to do?\n");

        while (s !="exit") {

            s = console.getStringInput("");

            switch (s) {
                case "add":

                    currentDouble = getInputs.getx(currentDouble, "First number: ");
                    currentString = Double.toString(currentDouble);
                    y = getInputs.gety(currentString + " + ");

                    basicCalc.add(currentDouble, y);
                    currentDouble = basicCalc.getDoubleResult();
                    currentString = basicCalc.getStringResult();
                    break;

                case "subtract":

                    currentDouble = getInputs.getx(currentDouble,"First number: ");
                    currentString = Double.toString(currentDouble);
                    y = getInputs.gety(currentString + " - ");

                    basicCalc.subtract(currentDouble, y);
                    currentDouble = basicCalc.getDoubleResult();
                    currentString = basicCalc.getStringResult();
                    break;

                case "multiply":

                    currentDouble = getInputs.getx(currentDouble,"First Number: ");
                    currentString = Double.toString(currentDouble);
                    y = getInputs.gety(currentString + " * ");

                    basicCalc.multiply(currentDouble, y);
                    currentDouble = basicCalc.getDoubleResult();
                    currentString = basicCalc.getStringResult();
                    break;

                case "divide":

                    currentDouble = getInputs.getx(currentDouble,"First number");
                    currentString = Double.toString(currentDouble);
                    y = getInputs.gety(currentString + " / ");

                    basicCalc.divide(currentDouble, y);
                    currentDouble = basicCalc.getDoubleResult();
                    currentString = basicCalc.getStringResult();
                    break;

                case "sine":
                    currentDouble = getInputs.getx(currentDouble,"sine of: ");
                    sciencecalc.sine(currentDouble);
                    currentDouble = sciencecalc.getDoubleResult();
                    currentString = sciencecalc.getStringResult();
                    break;

                case "cosine":
                    currentDouble = getInputs.getx(currentDouble,"cosine of: ");
                    sciencecalc.cosine(currentDouble);
                    currentDouble = sciencecalc.getDoubleResult();
                    currentString = sciencecalc.getStringResult();
                    break;

                case "tangent":
                    currentDouble = getInputs.getx(currentDouble,"tangent of: ");
                    sciencecalc.tangent(currentDouble);
                    currentDouble = sciencecalc.getDoubleResult();
                    currentString = sciencecalc.getStringResult();
                    break;

                case "arcsine":
                    currentDouble = getInputs.getx(currentDouble,"Inverse Sine of: ");
                    sciencecalc.inverseSine(currentDouble);
                    currentDouble = sciencecalc.getDoubleResult();
                    currentString = sciencecalc.getStringResult();
                    break;

                case "arccosine":
                    currentDouble = getInputs.getx(currentDouble,"Inverse Cosine of: ");
                    sciencecalc.inverseCosine(currentDouble);
                    currentDouble = sciencecalc.getDoubleResult();
                    currentString = sciencecalc.getStringResult();
                    break;

                case "arctangent":
                    currentDouble = getInputs.getx(currentDouble,"Inverse Tangent of: ");
                    sciencecalc.inverseTangent(currentDouble);
                    currentDouble = sciencecalc.getDoubleResult();
                    currentString = sciencecalc.getStringResult();
                    break;

                case "log":
                    currentDouble = getInputs.getx(currentDouble,"log of: ");
                    sciencecalc.log(currentDouble);
                    currentDouble = sciencecalc.getDoubleResult();
                    currentString = sciencecalc.getStringResult();
                    break;

                case "log10":
                    currentDouble = getInputs.getx(currentDouble,"natural log of: ");
                    sciencecalc.log10(currentDouble);
                    currentDouble = sciencecalc.getDoubleResult();
                    currentString = sciencecalc.getStringResult();
                    break;

                case "inverselog":
                    currentDouble = getInputs.getx(currentDouble,"inverse log of: ");
                    sciencecalc.inverselog(currentDouble);
                    currentDouble = sciencecalc.getDoubleResult();
                    currentString = sciencecalc.getStringResult();
                    break;

                case "inverselog10":
                    currentDouble = getInputs.getx(currentDouble,"inverse natural log of: ");
                    sciencecalc.inverseLog10(currentDouble);
                    currentDouble = sciencecalc.getDoubleResult();
                    currentString = sciencecalc.getStringResult();
                    break;

                case "exponent":
                    currentDouble = getInputs.getx(currentDouble, "First number: ");
                    currentString = Double.toString(currentDouble);
                    y = getInputs.gety(currentString + " to the power of: ");
                    sciencecalc.exponent(currentDouble, y);
                    currentDouble = sciencecalc.getDoubleResult();
                    currentString = sciencecalc.getStringResult();

                    break;

                case "square":
                    currentDouble = getInputs.getx(currentDouble,"Square of: ");
                    currentString = Double.toString(currentDouble);
                    sciencecalc.square(currentDouble);
                    currentDouble = sciencecalc.getDoubleResult();
                    currentString = sciencecalc.getStringResult();
                    break;

                case "sqrt":
                    currentDouble = getInputs.getx(currentDouble,"Square root of: ");
                    currentString = Double.toString(currentDouble);
                    sciencecalc.squareRoot(currentDouble);
                    currentDouble = sciencecalc.getDoubleResult();
                    currentString = sciencecalc.getStringResult();
                    break;

                case "inverse":
                    currentDouble = getInputs.getx(currentDouble,"Inverse of: ");
                    currentString = Double.toString(currentDouble);
                    sciencecalc.inverse(currentDouble);
                    currentDouble = sciencecalc.getDoubleResult();
                    currentString = sciencecalc.getStringResult();
                    break;

                case "!":
                    currentDouble = getInputs.getx(currentDouble,"Factorial of: ");
                    currentString = Double.toString(currentDouble);
                    sciencecalc.factorial(currentDouble);
                    currentDouble = sciencecalc.getDoubleResult();
                    currentString = sciencecalc.getStringResult();
                    break;

                case "M+":
                    memoryandSettings.rememberthis(currentDouble);
                    break;

                case "MRC":
                    currentDouble = memoryandSettings.getRememberedNum();
                    currentString = Double.toString(currentDouble);
                    console.println(currentDouble + " was recalled.");
                    break;

                case "MC":
                    memoryandSettings.forgetthis();
                    break;

                case "settings":
                    memoryandSettings.select();
                    break;

                case "clear":
                    currentDouble = 0.0;
                    currentString = "0";
                    break;

                case "exit":
                    s = "exit";
                    currentString = "";
                    break;

                default:

                    try {
                        currentDouble = Double.valueOf(s);
                        currentString = Double.toString(currentDouble);
                    } catch (Exception e) {
                        console.println("I do not understand.");
                    }
                    break;



            }


            switch (memoryandSettings.getBodh()) {
                case "binary":
                    break;
                case "octal":
                    break;
                case "decimal":
                    break;
                case "hexadecimal":
                    break;
        }



            console.println(currentString);

        }
        System.exit(0);
    }

}
