package crawley.james.Project1Calculator;

import java.util.Scanner;

/**
 * Created by jamescrawley on 9/10/16.
 */
public class Core {

    Scanner scanner = new Scanner(System.in);
    MathFunctions mathFunc = new MathFunctions();
    CalculatorSettings settings = new CalculatorSettings();
    private boolean isOn = true;
    private boolean isErr = false;

    public Core() {

    }

    public void receiveCommand () {

        System.out.println("Input a command: ");
        executeCommand(scanner.next());
    }

    public double getNumberInput () {

        System.out.println("Input a number: ");

        return scanner.nextDouble();
    }

    public boolean isRunning () {

        return isOn;
    }

    public void executeCommand (String command) {

        double currentDisplayState = settings.getState();

        clearError(command);

        switch (command) {
            case "add":
                updateDisplay(mathFunc.add(currentDisplayState, getNumberInput()));
                break;

            case "subtract":
                updateDisplay(mathFunc.subtract(currentDisplayState, getNumberInput()));
                break;

            case "multiply":
                updateDisplay(mathFunc.multiply(currentDisplayState, getNumberInput()));
                break;

            case "divide":

                currentDisplayState = mathFunc.divide(currentDisplayState, getNumberInput());
                currentDisplayState = generateError(currentDisplayState);

                updateDisplay(currentDisplayState);

                break;

            case "square":
                updateDisplay(mathFunc.square(currentDisplayState));
                break;

            case "square_root":

                currentDisplayState = mathFunc.squareRoot(currentDisplayState);
                currentDisplayState = generateError(currentDisplayState);

                updateDisplay(currentDisplayState);
                break;

            case "cube":
                updateDisplay(mathFunc.cube(currentDisplayState));
                break;

            case "cube_root":
                updateDisplay(mathFunc.cubeRoot(currentDisplayState));
                break;

            case "exponent":
                updateDisplay(mathFunc.exponent(currentDisplayState, getNumberInput()));
                break;

            case "inverse":

                currentDisplayState = mathFunc.inverse(currentDisplayState);
                currentDisplayState = generateError(currentDisplayState);

                updateDisplay(currentDisplayState);

                break;

            case "switch_sign":
                updateDisplay(mathFunc.switchSign(currentDisplayState));
                break;

            case "sine":

                if (settings.getTrigUnits().equals(TrigUnits.DEGREES)) {
                    currentDisplayState = Math.toRadians(settings.getState());
                }
                updateDisplay(mathFunc.sine(currentDisplayState));
                break;

            case "cosine":

                if (settings.getTrigUnits().equals(TrigUnits.DEGREES)) {
                    currentDisplayState = Math.toRadians(settings.getState());
                }
                updateDisplay(mathFunc.cosine(currentDisplayState));
                break;

            case "tangent":


                if (settings.getTrigUnits().equals(TrigUnits.DEGREES)) {
                    currentDisplayState = Math.toRadians(settings.getState());
                }

                currentDisplayState = mathFunc.tangent(currentDisplayState);
                currentDisplayState = generateError(currentDisplayState);
                updateDisplay(currentDisplayState);
                break;

            case "inverse_sine":

                if (settings.getTrigUnits().equals(TrigUnits.DEGREES)) {
                    currentDisplayState = Math.toRadians(settings.getState());
                }

                currentDisplayState = mathFunc.inverseSine(currentDisplayState);
                currentDisplayState = generateError(currentDisplayState);
                updateDisplay(currentDisplayState);
                break;


            case "inverse_cosine":

                if (settings.getTrigUnits().equals(TrigUnits.DEGREES)) {
                    currentDisplayState = Math.toRadians(settings.getState());
                }

                currentDisplayState = mathFunc.inverseCosine(currentDisplayState);
                currentDisplayState = generateError(currentDisplayState);
                updateDisplay(currentDisplayState);
                break;

            case "inverse_tangent":

                if (settings.getTrigUnits().equals(TrigUnits.DEGREES)) {
                    currentDisplayState = Math.toRadians(settings.getState());
                }

                currentDisplayState = mathFunc.inverseTangent(currentDisplayState);
                currentDisplayState = generateError(currentDisplayState);
                updateDisplay(currentDisplayState);
                break;


            case "factorial":
                currentDisplayState = overflow((long) currentDisplayState);
                updateDisplay(currentDisplayState);
                break;

            case "logarithm":
                currentDisplayState = mathFunc.logarithm(currentDisplayState);
                currentDisplayState = generateError(currentDisplayState);
                updateDisplay(currentDisplayState);
                break;

            case "natural_logarithm":
                currentDisplayState = mathFunc.naturalLogarithm(currentDisplayState);
                currentDisplayState = generateError(currentDisplayState);
                updateDisplay(currentDisplayState);
                break;

            case "inverse_logarithm":
                updateDisplay(mathFunc.inverseLogarithm(currentDisplayState));
                break;

            case "inverse_natural_logarithm":
                updateDisplay(mathFunc.inverseNaturalLogarithm(currentDisplayState));
                break;

            case "binary":
                settings.setCountingBase(CountingBase.BINARY);
                break;

            case "octal":
                settings.setCountingBase(CountingBase.OCTAL);
                break;

            case "decimal":
                settings.setCountingBase(CountingBase.DECIMAL);
                break;

            case "hexadecimal":
                settings.setCountingBase(CountingBase.HEXADECIMAL);
                break;

            case "change_base":
                settings.setCountingBase();
                break;

            case "radians":
                settings.setTrigUnits(TrigUnits.RADIANS);
                break;

            case "degrees":
                settings.setTrigUnits(TrigUnits.DEGREES);
                break;

            case "change_units":
                settings.setTrigUnits();
                break;

            case "quit":
                System.out.println("Turning off.");
                isOn = false;
                break;

            case "clear":
                isErr = false;
                updateDisplay(0);
                break;

            case "store":
                settings.setMemory(settings.getState());
                break;

            case "recall":
                updateDisplay(settings.getMemory());
                break;

            case "clear_memory":
                settings.setMemory(0);
                break;

            default:
                System.out.println("Please input a valid command.");
        }
    }


    public void updateDisplay (double val) {

        if (isErr) {

            System.out.println("Err");

        } else {
            settings.setState(val);
            double newState = settings.getState();

            switch (settings.getCountingBase()) {


                case BINARY:

                    System.out.println("The result is: " + Integer.toBinaryString((int) newState)); //from stack overflow
                    break;

                case OCTAL:

                    System.out.println("The result is: " + Integer.toOctalString((int) newState));
                    break;

                case DECIMAL:
                    System.out.println("The result is: " + newState);
                    break;

                case HEXADECIMAL:

                    System.out.println("The result is: " + Integer.toHexString((int) newState));
                    break;

                default:
                    System.out.println("Something has gone horribly wrong.");


            }
        }
    }

    public void clearError (String command) {

        if (isErr) {

            switch (command) {

                case "clear":
                    isErr = false;
                    break;
                case "quit" :
                    isErr = false;
                    break;
                default:
                    System.out.println("Please clear the display.");
                    System.out.println("Err");
                    receiveCommand();

            }

        }
    }

    public double generateError (double result) {
        if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY || Double.isNaN(result)) {
            //isNaN and Infinity constants from Stack Overflow
            isErr = true;
            result = 0;
        }
        return result;
    }

    public long overflow (long result) {
        if (Math.abs(result) > 21) {
            isErr = true;
            result = 0;
        } else {
            result = mathFunc.factorial((long)result);
        }

        return result;
    }

}
