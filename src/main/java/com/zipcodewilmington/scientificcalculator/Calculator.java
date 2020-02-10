package com.zipcodewilmington.scientificcalculator;

public class Calculator {

    public String mode = "dec";



    public double add(double var1, double var2) {
        return var1 + var2;
    }

    public double subtract(double var1, double var2) {
        return var1 - var2;
    }

    public double multiply(double var1, double var2) {
        return var1 * var2;
    }

    public double divide(double var1, double var2) {
        if(var1==0 && var2 ==0){
            return Double.NaN;
        }
        return var1 / var2;
    }

    public double square(double var1) {
        return var1 * var1;
    }

    public double squareRoot(double var1) {
        return Math.sqrt(var1);
    }

    public double exponent(double var1, double var2) {
        return Math.pow(var1, var2);
    }

    public double inverse(double var1) {
        return (1 / var1);
    }

    public double signSwitch(double var1) {
        return (var1 * -1);
    }

    public double sin(double var1) {
        return (Math.sin(var1));
    }

    public double cos(double var1) {
        return (Math.cos(var1));
    }

    public double tangent(double var1) {
        return (Math.tan(var1));

    }

    public double InverseSin(double var1) {
        return (Math.asin(var1));
    }

    public double InverseCos(double var1) {
        return (Math.acos(var1));
    }

    public double InverseTangent(double var1) {
        return (Math.atan(var1));
    }

    public double log(double var1) {
        return (Math.log(var1));
    }

    public double log10X(double var1) {
        return (Math.log10(var1));
    }

    public double invLog(double var1) {
        return (Math.pow(10,var1));
    }

    public double invNatLog(double var1) {
        return (Math.exp(var1));
    }


    public double factorial(double var1) {
        if (var1 < 0) {return (Double.NaN);}
            else {
            double factorial = 1;

                for (int i = 2; i <= var1; i++) {
                    factorial = factorial * i;
                }
                return factorial;
            }
    }

    public String  DecimalToOther(int var1, int radix){
        return Integer.toString(var1, radix);
    }
    public double toRadians(double var1) {
        return Math.toRadians(var1);
    }
    public double toDegrees(double var1) {
        return Math.toDegrees(var1);
    }

    public double secretof73 (double var1) {
        var1 = ((((var1 * 10001) / 137) / var1));
        return var1;
    }
    public boolean isPrime(double n) {
        if (n <= 1 || n != (int)n) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

