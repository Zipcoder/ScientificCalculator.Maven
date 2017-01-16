package mattern.william;

/**
 * Created by williammattern on 1/16/17.
 */
public class CalculatorComplexFunctions {

    static public double calculateSquare(double firstNumber){
        return Display.calculatedValue = firstNumber * firstNumber;
    }

    static public double calculateSquareRoot(double firstNumber){
        return Display.calculatedValue = java.lang.Math.sqrt(firstNumber);
    }

    static public double calculateInverse(double firstNumber){
        if (firstNumber == 0){
            Display.sendErrorMessage();
            return 0;
        } else {
            return Display.calculatedValue = (1 / firstNumber);
        }
    }
}
