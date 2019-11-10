package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.OperationClasses.Arithmetic;
import org.junit.Assert;
import org.junit.Test;

public class TestArithmetic {

    @Test
    public void additionTest(){
        // : Given
        Double expected = 2.0;

        // : When
        Double actual = Arithmetic.addition( 1.0, 1.0);

        // : Expected
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void additionTest2(){
        // : Given
        Double expected = -30.0;

        // : When
        Double actual = Arithmetic.addition( -15.0, -15.0);

        // : Expected
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void additionTest3(){
        // : Given
        Double expected = 45.1;

        // : When
        Double actual = Arithmetic.addition( 60.1, -15.0);

        // : Expected
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void subtractionTest(){
        // : Given
        Double expected = 0.0;

        // : When
        Double actual = Arithmetic.subtraction( 1.0, 1.0);

        // : Expected
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void subtractionTest2(){
        // : Given
        Double expected = -15.0;

        // : When
        Double actual = Arithmetic.subtraction( 45.0, 60.0);

        // : Expected
        Assert.assertEquals(expected, actual);
    }
    @Test
    //come back
    public void subtractionTest3(){
        // : Given
        Double expected = -9.900000000000006;

        // : When
        Double actual = Arithmetic.subtraction( -80.5, -70.6);

        // : Expected
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void divisionTest(){
        // : Given
        Double expected = 2.0;

        // : When
        Double actual = Arithmetic.division( 2.0, 1.0);

        // : Expected
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void divisionTest2(){
        // : Given
        Double expected = -2.0;

        // : When
        Double actual = Arithmetic.division( -50.0, 25.0);

        // : Expected
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void divisionTest3(){
        // : Given
        Double expected = -1.3333333333333333;

        // : When
        Double actual = Arithmetic.division( 60.0, -45.0);

        // : Expected
        Assert.assertEquals(expected, actual);
    }
    //
    @Test
    public void multiplicationTest(){
        // : Given
        Double expected = 4.0;

        // : When
        Double actual = Arithmetic.multiplication( 2.0, 2.0);

        // : Expected
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void multiplicationTest2(){
        // : Given
        Double expected = 25.0;

        // : When
        Double actual = Arithmetic.multiplication( -5.0, -5.0);

        // : Expected
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void multiplicationTest3(){
        // : Given
        Double expected = -60.0;

        // : When
        Double actual = Arithmetic.multiplication( -30.0, 2.0);

        // : Expected
        Assert.assertEquals(expected, actual);
    }
}
