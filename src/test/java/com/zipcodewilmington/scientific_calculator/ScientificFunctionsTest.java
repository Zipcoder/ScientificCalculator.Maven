package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.ScientificFunctions;
import org.junit.Assert;
import org.junit.Test;

public class ScientificFunctionsTest {
    com.zipcodewilmington.scientificcalculator.ScientificFunctions ScientificFunctions = new ScientificFunctions();

    @Test
    public void positiveintegerAdderTest() {
        Double assumed = 2.;
        Double actual = ScientificFunctions.add(1., 1.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void NegativeIntegerAdderTest() {
        Double assumed = -10.;
        Double actual = ScientificFunctions.add(0., -10.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void SubtractionTestPositiveReturn() {
        Double assumed = 1.;
        Double actual = ScientificFunctions.subtract(3., 2.);
        Assert.assertEquals(assumed, actual);

    }

    @Test
    public void SubtractionTestZeroReturn() {
        Double assumed = 0.;
        Double actual = ScientificFunctions.subtract(3., 3.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void SubtractionTestNegativeReturn() {
        Double assumed = -1.;
        Double actual = ScientificFunctions.subtract(3., 4.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void MultiplicationPositiveReturn() {
        Double assumed = 16.;
        Double actual = ScientificFunctions.multiply(8., 2.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void MultiplicationZeroReturn() {
        Double assumed = 0.;
        Double actual = ScientificFunctions.multiply(0., 3.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void MultiplicationNegativeReturn() {
        Double assumed = -9.;
        Double actual = ScientificFunctions.multiply(-3., 3.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void MultiplicationBothNegativeNumbers() {
        Double assumed = 9.;
        Double actual = ScientificFunctions.multiply(-3., -3.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void DivisionPositiveReturnWholeNumber() {
        Double assumed = 5.;
        Double actual = ScientificFunctions.divide(10., 2.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void DivisionPositiveReturnDecimal() {
        Double assumed = 1.5;
        Double actual = ScientificFunctions.divide(3., 2.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void squareRootReturnPositiveWholeNumber() {
        Double assumed = 3.;
        Double actual = ScientificFunctions.squareRoot(9.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void squareRootReturnPositiveDecimal() {
        Double assumed = 3.1622776601683795;
        Double actual = ScientificFunctions.squareRoot(10.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void SquareReturnPositiveWholeNumber() {
        Double assumed = 4.;
        Double actual = ScientificFunctions.square(2.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void SquareReturnNegativeWholeNumber() {
        Double assumed = -25.;
        Double actual = ScientificFunctions.square(-5.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void SquareReturnPositiveDecimal() {
        Double assumed = 30.25;
        Double actual = ScientificFunctions.square(5.5);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void SquareReturnNegativeDecimal() {
        Double assumed = -30.25;
        Double actual = ScientificFunctions.square(-5.5);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void ChangeSignFromPositive() {
        Double assumed = -5.;
        Double actual = ScientificFunctions.changeSign(5.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void ChangeSignFromNegative() {
        Double assumed = 5.;
        Double actual = ScientificFunctions.changeSign(-5.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void SinePositiveNumber() {
        Double assumed = -0.5440211108893698;
        Double actual = ScientificFunctions.sine(10.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void SineNegativeNumber() {
        Double assumed = 0.5440211108893698;
        Double actual = ScientificFunctions.sine(-10.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void SineZeroNumber() {
        Double assumed = 0.;
        Double actual = ScientificFunctions.sine(0.);
        Assert.assertEquals(assumed, actual);
    }
/*
    @Test
    public void squareRootReturnZero(){
        String assumed = "Whatever logic my boys put";
        Double actual = ScientificFunctions.squareRoot(10. );
        Assert.assertEquals( assumed, actual);
    }*/

/*
    @Test
    public void squareRootReturnNegative(){
        String assumed = "Whatever logic my boys put";
        Double actual = ScientificFunctions.squareRoot(10. );
        Assert.assertEquals( assumed, actual);
    }*/

    @Test
    public void CosineNegativeNumber() {
        Double assumed = -0.8390715290764524;
        Double actual = ScientificFunctions.cosine(-10.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void CosinePositiveNumber() {
        Double assumed = -0.8390715290764524;
        Double actual = ScientificFunctions.cosine(10.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void CosineZeroNumber() {
        Double assumed = 1.;
        Double actual = ScientificFunctions.cosine(0.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void TangentZeroNumber() {
        Double assumed = 0.;
        Double actual = ScientificFunctions.tangent(0.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void TangentPositiveNumber() {
        Double assumed = 0.6483608274590866;
        Double actual = ScientificFunctions.tangent(10.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void TangentNegativeNumber() {
        Double assumed = -0.6483608274590866;
        Double actual = ScientificFunctions.tangent(-10.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void ExponentPositiveNumbers() {
        Double assumed = 4.;
        Double actual = ScientificFunctions.exponent(2., 2.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void ExponentNegativeNumbers() {
        Double assumed = 4.;
        Double actual = ScientificFunctions.exponent(-2., 2.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void ExponentNegativeExponentPositiveNumber() {
        Double assumed = .25;
        Double actual = ScientificFunctions.exponent(2., -2.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void ExponentNegativeExponentNegativeNumber() {
        Double assumed = .25;
        Double actual = ScientificFunctions.exponent(-2., -2.);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void ExponentZeroPositiveNumber() {
        Double assumed = 1.;
        Double actual = ScientificFunctions.exponent(2., .0);
        Assert.assertEquals(assumed, actual);
    }

    @Test
    public void ExponentZeroZeroNumber() {
        Double assumed = 1.;
        Double actual = ScientificFunctions.exponent(0., .0);
        Assert.assertEquals(assumed, actual);
    }
}
