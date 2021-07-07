package com.zipcodewilmington.scientificcalculator;

public class CoreFeatures {
    // INSTANCE VARIABLES

    private double x;
    private double y;

    /*
      *   3 CONSTRUCTORS
       *      X & Y
      *       X
     */
    public CoreFeatures(){

    }
    public CoreFeatures(double x, double y){
        this.x = x;
        this.y = y;
    }
    public CoreFeatures(double x){
        this.x = x;
    }

    /*
     * Core methods
     *   addition    subtraction     multiplication      division   exponential
     *   square      squareRoot      inverse
     * */

    public double addition (double x, double y) {

        return (x + y);
    }

    public double subtraction (double x, double y) {

        return (x - y);
    }

    public double multiplication (double x, double y) {

        return (x * y);
    }

    public double division (double x, double y) {

        return (x / y);
    }

    public double exponentiation(double x, double y){

        return Math.pow(x, y);
    }

    public double square(double x){

        return Math.pow(x, 2);
    }

    public double squareRoot(double x){

        return Math.sqrt(x);
    }

    public double inverse(double x){

        return (1/x);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
}
