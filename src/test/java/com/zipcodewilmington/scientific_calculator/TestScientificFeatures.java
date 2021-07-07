package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CoreFeatures;
import com.zipcodewilmington.scientificcalculator.ScientificFeatures;

import static org.junit.Assert.assertEquals;

public class TestScientificFeatures {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    /*
     * TEST CORE FEATURE METHODS
     * ADDITION  SUBTRACTION     MULTIPLICATION  DIVISION    EXPONENTIAL
     * SQUARE    SQUARE ROOT      INVERSE
     * */

    @org.junit.Test
    public void TestSine() {

        /////WHAT TO TEST
        ScientificFeatures a = new ScientificFeatures();

        //////TEST
        assertEquals(1, a.sine(Math.toRadians(90)), 0);
        assertEquals(1, a.sine(Math.PI / 2), 0);
        assertEquals(1, a.sine(90), 0.11);
    }

    /*
     * TEST CORE FEATURE METHODS
     * ADDITION  SUBTRACTION     MULTIPLICATION  DIVISION    EXPONENTIAL
     * SQUARE    SQUARE ROOT      INVERSE
     * */
    @org.junit.Test
    public void TestCos() {
        /////WHAT TO TEST
        ScientificFeatures a = new ScientificFeatures();
        //////TEST
        assertEquals(1, a.cosine(0), 0);
        assertEquals(-1, a.cosine(Math.PI), 0);
        assertEquals(.2836621855, a.cosine(5),.000000001);
    }

    @org.junit.Test
    public void TestTan() {
        /////WHAT TO TEST
        ScientificFeatures a = new ScientificFeatures();
        //////TEST
        assertEquals(0, a.tangent(0), .00000000000001);
        assertEquals(0, a.tangent(Math.PI), .000000000000001);
        assertEquals(-6.7997114552, a.tangent(8),.0000000001);
    }

    @org.junit.Test
    public void TestInverseSine() {
        /////WHAT TO TEST
        ScientificFeatures a = new ScientificFeatures();
        //////TEST
        //assertEquals(2, a.inverseSine((Math.PI/6)), 0);
        assertEquals(0, a.inverseSine(0), 0);
        assertEquals(1.57079633, a.inverseSine(1), .00000001);
        assertEquals(.52359878, a.inverseSine(.5), .00000001);
    }

    @org.junit.Test
    public void TestInverseCosine() {
        /////WHAT TO TEST
        ScientificFeatures a = new ScientificFeatures();
        //////TEST
        assertEquals(0, a.inverseCosine(1), 0);
        assertEquals(Math.PI, a.inverseCosine(-1), 0);
        assertEquals(1.04719755, a.inverseCosine(.5), .00000001);
    }

    @org.junit.Test
    public void TestInverseTangent() {
        /////WHAT TO TEST
        ScientificFeatures a = new ScientificFeatures();
        //////TEST
        assertEquals(.463647609, a.inverseTangent(.5), .00000001);
        assertEquals(.78539816, a.inverseTangent(1), .00000001);
        assertEquals(1.37340077, a.inverseTangent(5), .00000001);
    }

    @org.junit.Test
    public void TestLog() {
        /////WHAT TO TEST
        ScientificFeatures a = new ScientificFeatures();
        //////TEST
        assertEquals(4, a.log(10000), 0);
        assertEquals(9, a.log(1000000000), 0);
        assertEquals(2, a.log(100) ,0);
    }

    @org.junit.Test
    public void TestInverseLog() {
        /////WHAT TO TEST
        ScientificFeatures a = new ScientificFeatures();
        //////TEST
        assertEquals(1000000, a.inverseLog(6), 0);
        assertEquals(1000, a.inverseLog(3), 0);
        assertEquals(10, a.inverseLog(1),0);
    }
    @org.junit.Test
    public void TestNaturalLog() {
        /////WHAT TO TEST
        ScientificFeatures a = new ScientificFeatures();
        //////TEST
        assertEquals(0, a.ln(1), 0);
        assertEquals(2.7080502011, a.ln(15), .000000001);
        assertEquals(2.0794415417, a.ln(8), .000000001);
    }
    @org.junit.Test
    public void TestInverseNaturalLog() {
        /////WHAT TO TEST
        ScientificFeatures a = new ScientificFeatures();
        //////TEST
        assertEquals(1, a.inverseNaturalLog(0), 0);
        assertEquals(148.413159, a.inverseNaturalLog(5), .000001);
        assertEquals(1096.633158, a.inverseNaturalLog(7), .000001);
    }

    @org.junit.Test
    public void TestFactorial() {
        /////WHAT TO TEST
        ScientificFeatures a = new ScientificFeatures();
        //////TEST
        assertEquals(5040, a.factorial(7), 0);
        assertEquals(6, a.factorial(3), 0);
        assertEquals(40320, a.factorial(8), 0);
    }

}

