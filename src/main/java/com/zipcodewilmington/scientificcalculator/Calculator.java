package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

public class Calculator {

    public Double operator;
    public Double firstOption;
    public Double secondOption;
    public Double ans;
    public Double history;
    public Double calcChoice;

    public Calculator() {

    }

    public Double setCalcChoice(Double choice) {
        this.calcChoice = choice;
        return choice;
    }

    public Double getCalcChoice() {
        return this.calcChoice;
    }


    public Double setAns(Double ans) {
        this.ans = ans;
        return ans;
    }

    public Double getAns() {
        return this.ans;
    }

    public Double getCurrentValue(Double currentValue) {
        return this.history;
    }

    public Double getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        Double userInput = scanner.nextDouble();
        return userInput;
    }

    public void setFirstInput(Double input){
        firstOption = input;
    }

    public void setSecondOptionInput(Double input){
       secondOption = input;
    }

    public void setOperator(Double input){
        operator = input;
    }

    public Double chooseCalc() {
        return null;
    }

    public Double getFirstNumber() {
        return firstOption;
    }

    public Double getSecondNumber() {
        return secondOption;
    }

}