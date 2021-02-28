package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CalculatorOperator;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    @Test
    public void addition() {
        Assertions.assertEquals(6 , CalculatorOperator.addition(3, 3));
    }

    @Test
    public void subtraction() {
        Assertions.assertEquals(-1 , CalculatorOperator.subtraction(3, 4));
    }

    @Test
    public void multiplication() {
        Assertions.assertEquals(17 , CalculatorOperator.multiplication(17, 1));
    }

    @Test
    public void division() {
        Assertions.assertEquals(1 , CalculatorOperator.division(22, 22));
    }

    @Test
    public void squareTest() {
        Assertions.assertEquals(9 , CalculatorOperator.square(3));
    }

    @Test
    public void squareRootTest() {
        Assertions.assertEquals(5 , CalculatorOperator.squareRoot(25));
    }

    @Test
    public void exponentsTest() {
        Assertions.assertEquals(4 , CalculatorOperator.exponents(2,2));
    }

    @Test
    public void multiplicativeInverseTest() {
        Assertions.assertEquals(1 , CalculatorOperator.multiplicativeInverse(1));
    }

    @Test
    public void additiveInverseTest() {
        Assertions.assertEquals(4 , CalculatorOperator.additiveInverse(-4));
    }

    @Test
    public void calculatorTest() {
        Assertions.assertEquals(5.2 , MainApplication.calculator("+", 2.2, 3.0));
        Assertions.assertEquals(-1 , MainApplication.calculator("-", 2.0, 3.0));
        Assertions.assertEquals(6 , MainApplication.calculator("*", 2.0, 3.0));
        Assertions.assertEquals(4 , MainApplication.calculator("/", 12, 3));
    }


}
