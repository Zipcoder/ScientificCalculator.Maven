package com.zipcodewilmington.scientificcalculator;

//import com.sun.jdi.connect.Connector;

public class ConversionCalculator {

    //fields for storing results
    private Double doubleResult;
    private String stringResult;

    //Constructor
    public ConversionCalculator(){
        doubleResult = 0.0;
        stringResult = "0";
    }

    //Scientific Operator Conversion functions
    //(binary, octal, decimal, hexadecimal)
    public void binary(int x){
        try {
            this.setStringResult(Integer.toBinaryString(x));
        }

        //for non-double inputs
        catch(Exception e){
            this.setDoubleResult((double) 0);
            this.setStringResult("ERROR");
        }
    }

    public void binaryToInt(String x){
        try {
            Integer y = Integer.parseInt(x,2);

            this.setStringResult(y.toString());
        }

        //for non-double inputs
        catch(Exception e){
            this.setDoubleResult((double) 0);
            this.setStringResult("ERROR");
        }
    }

    public void octal(int x){
        try {

            //this.setDoubleResult(Math.pow(x));
            this.setStringResult(Integer.toOctalString(x));
        }

        //for non-double inputs
        catch(Exception e){
            this.setDoubleResult((double) 0);
            this.setStringResult("ERROR");
        }
    }

    public void octalToInt(String x){
        try {
            Integer y = Integer.parseInt(x,8);

            this.setStringResult(y.toString());
        }

        //for non-double inputs
        catch(Exception e){
            this.setDoubleResult((double) 0);
            this.setStringResult("ERROR");
        }
    }

    public void decimal(int x){
        try {

            double y = x;
            this.setDoubleResult(y);
            this.setStringResult(Double.toString(y));
        }

        //for non-double inputs
        catch(Exception e){
            this.setDoubleResult((double) 0);
            this.setStringResult("ERROR");
        }
    }

    public void hexadecimal(int x){
        try {

            this.setStringResult(Integer.toHexString(x));
        }

        //for non-double inputs
        catch(Exception e){
            this.setDoubleResult((double) 0);
            this.setStringResult("ERROR");
        }
    }

    public void hexadecimalToInt(String x){
        try {
            Integer y = Integer.parseInt(x,16);

            this.setStringResult(y.toString());
        }

        //for non-double inputs
        catch(Exception e){
            this.setDoubleResult((double) 0);
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
