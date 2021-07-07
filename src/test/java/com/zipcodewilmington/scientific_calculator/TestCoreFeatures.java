package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.CoreFeatures;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class TestCoreFeatures {
    private final static Logger logger = Logger.getLogger(CoreFeatures.class.getName());

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
    public void TestAddition() {

        /////WHAT TO TEST
        CoreFeatures a = new CoreFeatures();

        //////TEST
        assertEquals(10, a.addition(5,5), 0);
        assertEquals( 82399, a.addition(3426, 78973), 0);
    }

    @org.junit.Test
    public void TestSubtraction(){
        /////WHAT TO TEST
        CoreFeatures a = new CoreFeatures();

        //////TEST
        assertEquals(0, a.subtraction(5,5), 0);
        assertEquals( 900, a.subtraction(1000,  100), 0);

    }

    @org.junit.Test
    public void TestMultiplication(){
        /////WHAT TO TEST
        CoreFeatures a = new CoreFeatures();

        //////TEST
        assertEquals(25, a.multiplication(5,5), 0);
        assertEquals( 100000, a.multiplication(1000,  100), 0);

    }

    @org.junit.Test
    public void TestDivision(){
        /////WHAT TO TEST
        CoreFeatures a = new CoreFeatures();

        //////TEST
        assertEquals(1, a.division(5,5), 0);
        assertEquals( 10, a.division(1000,  100), 0);

    }

    @org.junit.Test
    public void TestExponential(){
        /////WHAT TO TEST
        CoreFeatures a = new CoreFeatures();

        //////TEST
        assertEquals(3125, a.exponentiation(5,5), 0);
        assertEquals( 100, a.exponentiation(10,  2), 0);

    }

    @org.junit.Test
    public void TestSquare(){
        /////WHAT TO TEST
        CoreFeatures a = new CoreFeatures();

        //////TEST
        assertEquals(25, a.square(5), 0);
        assertEquals( 4, a.square(2), 0);

    }

    @org.junit.Test
    public void TestSquareRoot(){
        /////WHAT TO TEST
        CoreFeatures a = new CoreFeatures();

        //////TEST
        assertEquals(9, a.squareRoot(81), 0);
        assertEquals( 10, a.squareRoot(100), 0);

    }

    @org.junit.Test
    public void TestInverse(){
        /////WHAT TO TEST
        CoreFeatures a = new CoreFeatures();

        //////TEST
        assertEquals(.125, a.inverse(8), 0);
        assertEquals( .05, a.inverse(20), 0);

    }
    @org.junit.Test
    public void chungtest(){

    }
}


