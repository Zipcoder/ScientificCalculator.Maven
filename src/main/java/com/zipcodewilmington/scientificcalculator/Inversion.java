package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;

public class Inversion {
    public static Double changeSign (Double a)
    {
        Double output = a * (-1);
        return output;
    }

    public static Double inverseNum (Double a)
    {
        ErrorMessages.noInverseZero(a);
        Double output = 1 / a;
        return output;
    }
}
