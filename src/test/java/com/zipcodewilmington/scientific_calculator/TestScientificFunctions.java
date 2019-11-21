package com.zipcodewilmington.scientific_calculator;
import org.junit.Assert;
import com.zipcodewilmington.scientificcalculator.ScientificFunctions;
public class TestScientificFunctions {
    @org.junit.Before
    public void setup()throws Exception {
    }
    @org.junit.After
    public void tearDown() throws Exception{
    }
    @org.junit.Test
    public void TestScientificFunctionsSin() {
        ScientificFunctions sin1 = new ScientificFunctions();
        Assert.assertEquals(0.49, sin1.sin(30), 0.01);
        Assert.assertEquals(0.71, sin1.sin(45), 0.01);
        Assert.assertEquals(1.00, sin1.sin(90), 0.01);
    }
    @org.junit.Test
    public void TestScientificFunctionsCos() {
        ScientificFunctions cos1 = new ScientificFunctions();
        Assert.assertEquals(0.64, cos1.cos(50), 0.01);
        Assert.assertEquals(0.99, cos1.cos(5), 0.01);
        Assert.assertEquals(0.98, cos1.cos(10), 0.01);
    }
    @org.junit.Test
    public void TestScientificFunctionsTan() {
        ScientificFunctions tan1 = new ScientificFunctions();
        Assert.assertEquals(0.08, tan1.tan(5.00), 0.01);
        Assert.assertEquals(0.17, tan1.tan(10.00), 0.01);
        Assert.assertEquals(0.16, tan1.tan(9.00), 0.02);
    }
    @org.junit.Test
    public void TestScientificFunctionsAsin() {
        ScientificFunctions asin1 = new ScientificFunctions();
        Assert.assertEquals(1.57, Math.asin(1.00), 0.01);
        Assert.assertEquals(-0.52, Math.asin(-0.50), 0.01);
        Assert.assertEquals(0.52, Math.asin(0.50), 0.01);
    }
    @org.junit.Test
    public void TestScientificFunctionsAcos() {
        ScientificFunctions acos1 = new ScientificFunctions();
        Assert.assertEquals(1.54, acos1.acos(1), 0.01);
        Assert.assertEquals(1.54, acos1.acos(-1), 0.01);
        Assert.assertEquals(0.99, acos1.cos(-0.5), 0.01);
    }
    @org.junit.Test
    public void TestScientificFunctionsAtan() {
        ScientificFunctions atan1 = new ScientificFunctions();
        Assert.assertEquals(1.26, atan1.atan(1), 0.01);
        Assert.assertEquals(1.26, atan1.atan(-1), 0.01);
        Assert.assertEquals(1.26, atan1.atan(0), 0.01);
    }
    @org.junit.Test
    public void TestScientificFunctionsConvert() {
        ScientificFunctions toDegrees1 = new ScientificFunctions();
        Assert.assertEquals(57.29, toDegrees1.toDegrees(1), 0.01);
        Assert.assertEquals(114.59, toDegrees1.toDegrees(2), 0.01);
        Assert.assertEquals(171.88, toDegrees1.toDegrees(3), 0.01);
    }
    @org.junit.Test
    public void TestFactorial() {
        ScientificFunctions factorial1 = new ScientificFunctions();
        Assert.assertEquals(120, factorial1.factorial(5), 0.01);
        Assert.assertEquals(6, factorial1.factorial(3), 0.01);
        Assert.assertEquals(40320, factorial1.factorial(8), 0.01);
    }
}