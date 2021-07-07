package com.zipcodewilmington.scientificcalculator;

public class Shapes {

    public Shapes(){}

    //circle
    public double circleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }

    //triangle
    public double triangleArea(double w, double h){
        return 0.5 * w * h;
    }

    //quad
    public double quadArea(double w, double l){
        return w * l;
    }

}
