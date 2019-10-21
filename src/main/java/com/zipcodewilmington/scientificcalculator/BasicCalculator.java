package com.zipcodewilmington.scientificcalculator;

public class BasicCalculator {

    //fields for storing results
    private Double doubleResult;
    private String stringResult;

    //initializing an error class
    Error error = new Error();

    //Constructor
    public BasicCalculator(){
        doubleResult = null;
        stringResult = "0";
    }

    //Basic Operator functions
    public void add(Double x, Double y){
        try {

            this.setDoubleResult(x + y);
            this.setStringResult(Double.toString(x + y));
        }

        //for non-double inputs
        catch(Exception e){
            this.setDoubleResult(null);
            this.setStringResult("ERROR");
        }
    }

    public void subtract(Double x, Double y){
        try {
            this.setDoubleResult(x - y);
            this.setStringResult(Double.toString(x - y));

        }
        //for non double inputs
        catch(Exception e){
            this.setDoubleResult(null);
            this.setStringResult("ERROR");
        }
    }

    public void multiply(Double x, Double y){
        try {
            this.setDoubleResult(x * y);
            this.setStringResult(Double.toString(x * y));

        }
        //for non double inputs
        catch(Exception e){
            this.setDoubleResult(null);
            this.setStringResult("ERROR");
        }
    }

    public void divide(Double x, Double y){
        try {
            if (error.IsBadValue(x, 0.0)){
                this.setDoubleResult(null);
                this.setStringResult("ERROR");
            }
            else {
                this.setDoubleResult(x / y);
                this.setStringResult(Double.toString(x / y));
            }
        }
        //for non double inputs.
        catch(Exception e){
            this.setDoubleResult(null);
            this.setStringResult("ERROR");
        }
    }


    //Getters and Setters for class fields

    public double getDoubleResult() {
        return doubleResult;
    }

    public void setDoubleResult(Double doubleResult) {
        double number = (Math.round(doubleResult * 1000.0))/1000.0;
        this.doubleResult = number;
    }

    public String getStringResult() {
        return stringResult;
    }

    public void setStringResult(String stringResult) {
        this.stringResult = stringResult;
    }



}
