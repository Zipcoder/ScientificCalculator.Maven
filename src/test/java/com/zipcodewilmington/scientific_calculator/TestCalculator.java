package com.zipcodewilmington.scientific_calculator;

import org.junit.Test;
import org.junit.Assert;

import static com.zipcodewilmington.scientificcalculator.Calculator.*;

public class TestCalculator {
    @Test
    public void testAdd1() {
        String expected = "45.0";
        String actual = add(34, 11);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testAdd2() {
        String expected = "334.3";
        String actual = add(213.3, 121);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testAdd3() {
        String expected = "243.432";
        String actual = add(34.423, 209.009);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSubtract1() {
        String expected = "45.0";
        String actual = subtract(90, 45);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSubtract2() {
        String expected = "92.0";
        String actual = subtract(213.0, 121.0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSubtract3() {
        String expected = "249094.991";
        String actual = subtract(249304, 209.009);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMultiply1() {
        String expected = "49.0";
        String actual = multiply(7, 7);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMultiply2() {
        String expected = "46.512";
        String actual = multiply(.456, 102);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMultiply3() {
        String expected = "-34.0";
        String actual = multiply(17, -2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testDivide1() {
        String expected = "Err";
        String actual = divide(412, 0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testDivide2() {
        String expected = "53.0";
        String actual = divide(3551, 67);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testDivide3() {
        String expected = "0.04";
        String actual = divide(4, 100);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSquare1() {
        String expected = "64.0";
        String actual = square(8);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSquare2() {
        String expected = "121.0";
        String actual = square(11);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSquare3() {
        String expected = "635.04";
        String actual = square(25.2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSqrt1() {
        String expected = "8.0";
        String actual = sqrt(64);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSqrt2() {
        String expected = "11.0";
        String actual = sqrt(121);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSqrt3() {
        String expected = "25.2";
        String actual = sqrt(635.04);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testExp1() {
        String expected = "16.0";
        String actual = exp(2,4);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testExp2() {
        String expected = "91125.0";
        String actual = exp(45,3);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testExp3() {
        String expected = "81.0";
        String actual = exp(3,4);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testInverse1() {
        String expected = "0.5";
        String actual = inverse(2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testInverse2() {
        String expected = "0.1";
        String actual = inverse(10);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testInverse3() {
        String expected = "0.02";
        String actual = inverse(50);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testInvertSign1() {
        String expected = "-2.0";
        String actual = invertSign(2.0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testInvertSign2() {
        String expected = "-34.0";
        String actual = invertSign(34.0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testInvertSign3() {
        String expected = "450554.0";
        String actual = invertSign(-450554.0);
        Assert.assertEquals(expected, actual);
    }
}
