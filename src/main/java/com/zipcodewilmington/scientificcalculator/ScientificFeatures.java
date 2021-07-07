package com.zipcodewilmington.scientificcalculator;

public class ScientificFeatures {


    /*
        Trigonometry Methods
            Sine    Cosine      Tangent
            Inverse Sine       Inverse Cosine      Inverse Tangent
     */


    public double sine(double x){

        return Math.sin(x);
    }

    public double cosine(double x){

        return Math.cos(x);
    }

    public double tangent(double x){

        return Math.tan(x);
    }

    public double inverseSine(double x){

        return Math.asin(x);
    }

    public double inverseCosine(double x){

        return Math.acos(x);
    }

    public double inverseTangent(double x){

        return Math.atan(x);
    }

    /*
            Logarithmic Methodss
                Log     Inverse Log     Ln      Inverse Natural Log
     */

    public double log (double x){

        return Math.log10(x);
    }

    public double inverseLog (double x){

        return Math.pow(10, x);
    }

    public double ln (double x){

        return (Math.log(x));
    }

    public double inverseNaturalLog (double x){

        return Math.exp(x);
    }
    public double factorial(double num){
        double fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }

    public double switchMode(double answer){
        return answer * (Math.PI/180);
    }


}
