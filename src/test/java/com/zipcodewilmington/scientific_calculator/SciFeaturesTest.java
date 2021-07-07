package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.SciFeatures;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class SciFeaturesTest {
    SciFeatures test = new SciFeatures();

    @Test
    public void switchTest(){
        test.setDisplayMode("decimal");
        test.switchDisplayMode();
        assertEquals("hexadecimal", test.getDisplayMode());
    }
    @Test
    public void switchTest1(){
        test.setDisplayMode("binary");
        test.switchDisplayMode();
        assertEquals("octal", test.getDisplayMode());
    }
    @Test
    public void switchTest2(){
        test.setDisplayMode("hexadecimal");
        test.switchDisplayMode();
        assertEquals("binary", test.getDisplayMode());
    }
    @Test
    public void switchTest3(){
        test.setDisplayMode("octal");
        test.switchDisplayMode();
        assertEquals("decimal", test.getDisplayMode());
    }
    @Test
    public void switchTest4(){
        test.setDisplayMode("decimal");
        test.switchDisplayMode("hexadecimal");
        assertEquals("hexadecimal", test.getDisplayMode());
    }

    @Test
    public void memoryTest(){
        test.storeMemory(2);
        assertEquals(2, test.memoryRecall(), 0.01);
    }

    @Test
    public void sinTest(){
        assertEquals(Math.sin(90), test.sine(90), 0.01);
    }
    @Test
    public void cosTest(){
        assertEquals(Math.cos(90), test.cosine(90), 0.01);
    }
    @Test
    public void tanTest(){
        assertEquals(Math.tan(45), test.tangent(45), 0.01);
    }
    @Test
    public void invSinTest(){
        assertEquals(Math.asin(15), test.sineInverse(15), 0.01);
    }
    @Test
    public void invCosTest(){
        assertEquals(Math.acos(15), test.cosineInverse(15), 0.01);
    }
    @Test
    public void invTanTest(){
        assertEquals(Math.atan(15), test.tangentInverse(15), 0.01);
    }
    @Test
    public void sinTest1(){
        assertEquals(Math.sin(45), test.sine(45), 0.01);
    }
    @Test
    public void cosTest1(){
        assertEquals(Math.cos(45), test.cosine(45), 0.01);
    }
    @Test
    public void tanTest1(){
        assertEquals(Math.tan(15), test.tangent(15), 0.01);
    }
    @Test
    public void invSinTest1(){
        assertEquals(Math.asin(30), test.sineInverse(30), 0.01);
    }
    @Test
    public void invCosTest1(){
        assertEquals(Math.acos(30), test.cosineInverse(30), 0.01);
    }
    @Test
    public void invTanTest1(){
        assertEquals(Math.atan(30), test.tangentInverse(30), 0.01);
    }
    @Test
    public void unitModeTest(){
        test.unitsMode = "Degrees";
        test.switchUnitsMode();
        assertEquals("Radians", test.unitsMode);
    }
    @Test
    public void unitModeTest1(){
        test.unitsMode = "Radians";
        test.switchUnitsMode();
        assertEquals("Degrees", test.unitsMode);
    }
    @Test
    public void unitModeInpTest(){
        test.switchUnitsMode("Degrees");
        assertEquals("Degrees", test.unitsMode);
    }
    @Test
    public void unitModeInpTest1(){
        test.switchUnitsMode("Radians");
        assertEquals("Radians", test.unitsMode);
    }
    @Test
    public void logTest(){
        assertEquals(3, test.logarithm(1000), 0.01);
    }
    @Test
    public void logTest1(){
        assertEquals(4, test.logarithm(10000), 0.01);
    }
    @Test
    public void invLogTest(){
        assertEquals(10, test.inverseLog(1), 0.01);
    }
    @Test
    public void invLogTest1(){
        assertEquals(100, test.inverseLog(2), 0.01);
    }
    @Test
    public void natLogTest(){
        assertEquals(Math.log(3), test.naturalLog(3), 0.01);
    }
    @Test
    public void natLogTest1(){
        assertEquals(Math.log(10), test.naturalLog(10), 0.01);
    }
    @Test
    public void invNatLogTest(){
        assertEquals(Math.exp(5), test.inverseNaturalLog(5), 0.01);
    }
    @Test
    public void invNatLogTest1(){
        assertEquals(Math.exp(2.5), test.inverseNaturalLog(2.5), 0.01);
    }
    @Test
    public void factorialTest(){
        assertEquals(24, test.factorial(4), 0.01);
    }
    @Test
    public void factorialTest1(){
        assertEquals(5040, test.factorial(7), 0.01);
    }
}
