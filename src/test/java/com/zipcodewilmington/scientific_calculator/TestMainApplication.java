package com.zipcodewilmington.scientific_calculator;

/**
 * Created by leon on 2/9/18.
 */

import com.zipcodewilmington.scientificcalculator.MathMethods;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMainApplication {
    MathMethods test = new MathMethods();

    @Test
    public void addTest1() {
        assertEquals(10, test.add(5, 5), 0.01);
    }

    @Test
    public void addTest2() {
        assertEquals(10.5, test.add(7, 3.5), 0.01);
    }

    @Test
    public void subtractTest1() {
        assertEquals(2, test.subtract(7, 5), 0.01);
    }

    @Test
    public void subtractTest2() {
        assertEquals(10, test.subtract(20.5, 10.5), 0.01);
    }

    @Test
    public void multiplicationTest1() {
        assertEquals(56, test.multiplication(7, 8), 0.01);
    }

    @Test
    public void multiplicationTest2() {
        assertEquals(8.05, test.multiplication(2.3, 3.5), 0.01);
    }

    @Test
    public void divisionTest1() {
        assertEquals(3, test.division(15, 5), 0.01);
    }

    @Test
    public void divisionTest2() {
        assertEquals(6.0, test.division(36.0, 6.0), 0.01);
    }

    @Test
    public void remainderTest1() {
        assertEquals(2.0, test.remainder(5.00, 3.00), 0.01);
        ;
    }

    @Test
    public void remainderTest2() {
        assertEquals(0.00, test.remainder(6.00, 3.00), 0.01);
        ;
    }

    @Test
    public void squareTest1() {
        assertEquals(36.00, test.square(6.00), 0.01);
        ;
    }

    @Test
    public void squareTest2() {
        assertEquals(9.00, test.square(3.00), 0.01);
        ;
    }

    @Test
    public void squareRootTest1() {
        assertEquals(5.00, test.squareRoot(25.00), 0.01);
        ;
    }

    @Test
    public void squareRootTest2() {
        assertEquals(9.00, test.squareRoot(81.00), 0.01);
        ;
    }

    @Test
    public void variExpoTest1() {
        assertEquals(49.00, test.variExpo(7.00, 2.00), 0.01);

    }

    @Test
    public void variExpo1Test2() {
        assertEquals(1000.00, test.variExpo(10.00, 3.00), 0.01);

    }

    @Test
    public void invertTest1() {
        assertEquals(-10.00, test.invert(10.00), 0.01);
    }

    @Test
    public void invertTest2() {
        assertEquals(50.00, test.invert(-50.00), 0.01);
    }

    @Test
    public void sineTest1() {
        assertEquals(-0.7568, test.sine(4.00), 0.01);
    }

    @Test
    public void sineTest2() {
        assertEquals(0.9894, test.sine(8.00), 0.01);
    }

    @Test
    public void cosineTest1() {
        assertEquals(-0.9899, test.cosine(3.00), 0.01);
    }

    @Test
    public void cosineTest2() {
        assertEquals(0.7539, test.cosine(7.00), 0.01);
    }

    @Test
    public void tanTest1() {
        assertEquals(-2.185, test.tan(2.00), 0.01);
    }

    @Test
    public void tanTest2() {
        assertEquals(-225.95, test.tan(11.00), 0.01);
    }
}
