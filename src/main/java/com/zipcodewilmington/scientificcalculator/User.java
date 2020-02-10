package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class User {

    Double usersOperator;

    public  User (Double usersOperator) {
        this.usersOperator = usersOperator;
    }

    public Double getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        Double userInput = scanner.nextDouble();
        return userInput;
    }
}

