package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Features;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FeaturesTest {
    Features test = new Features();

    @Test
    public void addTest1() {
        assertEquals(5, test.add(2, 3), 0.01);
    }

    @Test
    public void addTest2() {
        assertEquals(5.5, test.add(3, 2.5), 0.01);
    }

    @Test
    public void subTest1() {
        assertEquals(10, test.subtract(13, 3), 0.01);
    }

    @Test
    public void subTest2() {
        assertEquals(2.2, test.subtract(5.2, 3), 0.01);
    }

    @Test
    public void multTest1() {
        assertEquals(12, test.multiply(6.0, 2), 0.01);
    }

    @Test
    public void multiTest2() {
        assertEquals(100, test.multiply(1, 100), 0.01);
    }

    @Test
    public void divTest1() {
        assertEquals(8, test.divide(32, 4), 0.01);
    }

    @Test
    public void divTest2(){
        assertEquals(5, test.divide(40, 8), 0.01);
    }
    @Test
    public void squareTest1(){
        assertEquals(25, test.square( 5), 0.01);
    }
    @Test
    public void squareTest2(){
        assertEquals(144, test.square( 12),0.01);
    }
    @Test
    public void rootTest1(){
        assertEquals(8, test.root( 64), 0.01);
    }
    @Test
    public void rootTest2(){
        assertEquals(2, test.root( 4), 0.01);
    }
    @Test
    public void exponentTest1(){
        assertEquals(32, test.exponent(2, 5), 0.01);
    }
    @Test
    public void exponentTest2(){
        assertEquals(282475249, test.exponent(7, 10), 0.01);
    }
    @Test
    public void invertTest1(){
        assertEquals(10,
                test.invert( -10),
                0.01);
    }
    @Test
    public void invertTest2(){
        assertEquals(-20,
                test.invert( 20),
                0.01);
    }
    @Test
    public void clearTest1(){
        assertEquals(0,
                test.clear(),
                0.01);
    }
    @Test
    public void clearTest2(){
        assertEquals(0,
                test.clear(),
                0.01);
    }
    @Test
    public void inverseTest1(){
        assertEquals(0.25, test.inverse( 4), 0.01);
    }

    @Test
    public void inverseTest2(){
        assertEquals(.33, test.inverse(3), 0.01);
    }

}
