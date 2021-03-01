package com.zipcodewilmington.scientific_calculator;
import static org.junit.Assert.assertEquals;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import javax.naming.NameNotFoundException;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.*;
/**
 * Created by leon on 2/9/18.
 */

public class TestMainApplication {

    //Basic functions tests
    @Test
    public void getSum() {
        MainApplication testSum = new MainApplication();
        assertEquals(10, testSum.findSum(8, 2), 0.0000001);
        assertEquals(163.987, testSum.findSum(100, 63.987), 0.0000001);
        assertEquals(420, testSum.findSum(69, 351), 0.0000001);
    }

    @Test
    public void getDifference() {
        MainApplication testDiff = new MainApplication();
        assertEquals(8, testDiff.findDifference(15, 7), 0.0000001);
        assertEquals(99.9, testDiff.findDifference(100.9, 1), 0.0000001);
        assertEquals(69, testDiff.findDifference(420, 351), 0.0000001);
    }

    @Test
    public void getProduct() {
        MainApplication testProduct = new MainApplication();
        assertEquals(100, testProduct.findProduct(10, 10), 0.0000001);
        assertEquals(12.5, testProduct.findProduct(2.5, 5), 0.0000001);
        assertEquals(28980, testProduct.findProduct(69, 420), 0.0000001);
    }

    @Test
    public void getQuotient() {
        MainApplication testQuotient = new MainApplication();
        assertEquals(10, testQuotient.findQuotient(100, 10), 0.0000001);
        assertEquals(33.3, testQuotient.findQuotient(99.9, 3), 0.0000001);
        assertEquals(6.0869565, testQuotient.findQuotient(420, 69), 0.0000001);
    }

    @Test
    public void getRemainder() {
        MainApplication testRemainder = new MainApplication();
        assertEquals(1, testRemainder.findRemainder(17, 2), 0.0000001);
        assertEquals(3, testRemainder.findRemainder(23, 5), 0.0000001);
        assertEquals(0, testRemainder.findRemainder(420, 2), 0.0000001);
    }

    //Log base 10 method tests
    @Test
    public void getLog0() {
        MainApplication newLog = new MainApplication();
        assertEquals(3.0, newLog.logarithm(1000.0), 0.0000001);
        assertEquals(1.0, newLog.logarithm(10.0), 0.0000001);
        assertEquals(-0.3010299957, newLog.logarithm(0.5), 0.0000001);
        assertEquals(-1.0, newLog.logarithm(0.1), 0.0000001);
        assertEquals(Double. NEGATIVE_INFINITY, newLog.logarithm(0.0), 0.0000001);
        assertEquals(Double.NaN, newLog.logarithm(-1.0), 0.0000001);
    }


    @Test //Inverted log base 10 test
    public void getInvLog0() {
        MainApplication newLog = new MainApplication();
        assertEquals(100000.0, newLog.invLog(5.0), 0.0000001);
        assertEquals(10.0, newLog.invLog(1.0), 0.0000001);
        assertEquals(3.16227766, newLog.invLog(0.5), 0.0000001);
        assertEquals(1.258925412, newLog.invLog(0.1), 0.0000001);
        assertEquals(0.1, newLog.invLog(-1.0), 0.0000001);
    }


    @Test //Natural Log tests
    public void getNatLog0() {
        MainApplication newLog = new MainApplication();
        assertEquals(1.609437912, newLog.natLog(5.0), 0.0000001);
        assertEquals(0.0, newLog.natLog(1.0), 0.0000001);
        assertEquals(Double.NEGATIVE_INFINITY, newLog.natLog(0.0), 0.0000001);
        assertEquals(Double.NaN, newLog.natLog(-1), 0.0000001);
        assertEquals(-2.302585093, newLog.natLog(0.1), 0.0000001);
    }

    @Test //Inverted Natural Log tests
    public void getInvNatLog0() {
        MainApplication newLog = new MainApplication();
        assertEquals(148.4131591, newLog.invNatLog(5.0), 0.0000001);
        assertEquals(1.0, newLog.invNatLog(0.0), 0.0000001);
        assertEquals(0.3678794412, newLog.invNatLog(-1.0), 0.0000001);
        assertEquals(1.105170918, newLog.invNatLog(0.1), 0.0000001);
        assertEquals(0.904837418, newLog.invNatLog(-0.1), 0.0000001);
    }



    @Test //Log base 10 method test
    public void getLog10() {
        MainApplication newLog = new MainApplication();
        assertEquals(1.0, newLog.logarithm(10.0), 0.0000001);
    }
    @Test //Log base 10 method Err test
    public void getLog101() {
        MainApplication newLog = new MainApplication();
        assertEquals(Double. NEGATIVE_INFINITY, newLog.logarithm(0.0), 0.0000001);
    }


    @Test //Inverted log test
    public void getInvLog10() {
        MainApplication newLog = new MainApplication();
        assertEquals(100000.0, newLog.invLog(5.0), 0.0000001);
    }
    @Test //Natural Log test
    public void getNetLog() {
        MainApplication newLog = new MainApplication();
        assertEquals(1.609437912, newLog.natLog(5.0), 0.0000001);
    }
    @Test //Inverted Natural Log test
    public void getInvNetLog() {
        MainApplication newLog = new MainApplication();
        assertEquals(148.4131591, newLog.invNatLog(5.0), 0.0000001);
    }



    @Test
    public void displayTest() {
        MainApplication displaytester = new MainApplication();
        assertEquals("binary", displaytester.switchDisplayMode());
        assertEquals("octal", displaytester.switchDisplayMode());
        assertEquals("decimal", displaytester.switchDisplayMode());
        assertEquals("hexadecimal", displaytester.switchDisplayMode());
    }

    @Test
    public void modeChange() {
        MainApplication modeChanger = new MainApplication();

        assertEquals("binary", modeChanger.switchDisplayMode("binary"));
        assertEquals("hexadecimal", modeChanger.switchDisplayMode("hexadecimal"));
        assertEquals("Err", modeChanger.switchDisplayMode("hello!"));
    }

    @Test
    public void unitChangeButton() {
        MainApplication unitChanger = new MainApplication();

        assertEquals("radians", unitChanger.switchUnitsMode());
        assertEquals("degrees", unitChanger.switchUnitsMode());
        assertEquals("radians", unitChanger.switchUnitsMode());
    }

    @Test
    public void unitChange() {
        MainApplication unitChanger1 = new MainApplication();

        assertEquals("radians", unitChanger1.switchUnitsMode("radians"));
        assertEquals("Err", unitChanger1.switchUnitsMode("Break me"));
        assertEquals("degrees", unitChanger1.switchUnitsMode("degrees"));
    }

    @Test
    public void sinTest() {
        MainApplication sinTest1 = new MainApplication();
        assertEquals(-1, sinTest1.getSin(270.0),0.000000001);
        assertEquals(0.5, sinTest1.getSin(30.0),0.000000001);
        assertEquals(1.0, sinTest1.getSin(90.0),0.000000001);
        //assertEquals(Float.NaN, sinTest1.getSin(30.0),0.000000001);
    }
    @Test
    public void sinpiTest(){
        MainApplication sinpiTest1 = new MainApplication();
        assertEquals(Float.NaN,sinpiTest1.getSinPi(Double.NaN),0.000001);
        assertEquals(Float.NaN,sinpiTest1.getSinPi(Double.NEGATIVE_INFINITY),0.000001);
        assertEquals(Float.NaN,sinpiTest1.getSinPi(Double.POSITIVE_INFINITY),0.000001);}
    @Test
    public void cosTest() {
        MainApplication cosTest1 = new MainApplication();
        assertEquals(0.866025,cosTest1.getCos(30.0),0.000001);
        assertEquals(0.5,cosTest1.getCos(60.0),0.1);
        assertEquals(1.0,cosTest1.getCos(0.0),0.1);
    }

    @Test
    public void cospiTest(){
        MainApplication cospiTest1 = new MainApplication();
        assertEquals(Float.NaN,cospiTest1.getCosPi(Double.NaN),0.000001);
        assertEquals(Float.NaN,cospiTest1.getCosPi(Double.NEGATIVE_INFINITY),0.000001);
        assertEquals(Float.NaN,cospiTest1.getCosPi(Double.POSITIVE_INFINITY),0.000001);}
    @Test
    public void tanTest() {
        MainApplication tanTest1 = new MainApplication();
        assertEquals(0,tanTest1.getTan(0.0),0.001);
        assertEquals(1,tanTest1.getTan(45.0),0.001);
        assertEquals(1.732,tanTest1.getTan(60.0),0.001);

    }
    @Test
    public void asinpiTest(){
        MainApplication asinTest1 = new MainApplication();
        assertEquals(Float.NaN,asinTest1.getAsinPi(Math.PI),0.000001);
        assertEquals(Float.NaN,asinTest1.getAsinPi(Double.NEGATIVE_INFINITY),0.000001);
        assertEquals(Float.NaN,asinTest1.getAsinPi(Double.POSITIVE_INFINITY),0.000001);
    }
    @Test
    public void asinTest(){
        MainApplication asinTest1 = new MainApplication();
        assertEquals(0.0,asinTest1.getAsin(0.0),0.000001);
        assertEquals(0.903,asinTest1.getAsin(45),0.001);
        assertEquals(-0.903,asinTest1.getAsin(-45),0.001);
    }
    @Test
    public void acosTest(){
        MainApplication acosTest1 = new MainApplication();
        assertEquals(0.2840,acosTest1.getAcos(55),0.0001);
        assertEquals(1.0197,acosTest1.getAcos(30.0),0.001);
        assertEquals(1.3953,acosTest1.getAcos(10.0),0.001);

    }
    @Test
    public void acospiTest(){
        MainApplication acospiTest1 = new MainApplication();
        assertEquals(Float.NaN,acospiTest1.getAcosPi(Math.PI),0.000001);
        assertEquals(Float.NaN,acospiTest1.getAsinPi(Double.NEGATIVE_INFINITY),0.000001);
        assertEquals(Float.NaN,acospiTest1.getAsinPi(Double.POSITIVE_INFINITY),0.000001);
    }

    @Test
    public void atanTest(){
        MainApplication atanTest1 = new MainApplication();
        assertEquals(0.0,atanTest1.getAtan(0.0), 0.01);
        assertEquals(1.537,atanTest1.getAtan(30.0), 0.01);
        assertEquals(1.5541,atanTest1.getAtan(60.0), 0.01);
    }


    @Test
    public void findFactorial() {
        MainApplication findFactorialTest = new MainApplication();

        assertEquals(120.0, findFactorialTest.findFactorial(5.0), 1e-15);
        assertEquals(362880, findFactorialTest.findFactorial(9), 1e-15);
        assertEquals(6.0, findFactorialTest.findFactorial(3.0), 1e-15);
    }

    @Test
    public void setCurrentValue() {
        MainApplication setCurrentValueTest = new MainApplication();

        assertEquals(10, setCurrentValueTest.setCurrentValue(10), 1e-15);
        assertEquals(21.1, setCurrentValueTest.setCurrentValue(21.1), 1e-15);
        assertNotEquals(5.0, setCurrentValueTest.setCurrentValue(5.1), 1e-15);
    }

    @Test
    public void clearMemory() {
        MainApplication clearMemoryTest = new MainApplication();
        clearMemoryTest.setCurrentValue(420);

        assertEquals(0, clearMemoryTest.addCurrentValueToMemory(), 1e-15);
        assertEquals(420, clearMemoryTest.getMemoryValue(), 1e-15);
        assertEquals(0, clearMemoryTest.clearMemory(), 1e-15);
        assertEquals(0, clearMemoryTest.clearMemory(), 1e-15);
        assertNotEquals(5.0, clearMemoryTest.clearMemory(), 1e-15);
    }

    @Test
    public void testStoredMemory() {
        MainApplication addMemTest = new MainApplication();
        addMemTest.setCurrentValue(6.0);

        assertEquals(6.0, addMemTest.returnCurrentValue(), 1e-15);
        assertEquals(0.0, addMemTest.addCurrentValueToMemory(), 1e-15);
        assertEquals(6.0, addMemTest.recallMemoryValue(), 1e-15);
    }

    @Test
    public void testGetSignInversion() {
        MainApplication getSignInversion1 = new MainApplication();
        assertEquals(-2.0, getSignInversion1.getSignInversion(2.0), 0.1);
        assertEquals(25.0, getSignInversion1.getSignInversion(-25.0), 0.1);
        assertEquals(0, getSignInversion1.getSignInversion(0), 0.1);
    }


    @Test
    public void testGetSquare() {
        MainApplication getSquare1 = new MainApplication();
        assertEquals(4.0, getSquare1.getSquare(2.0), 0.1);
        assertEquals(9.0, getSquare1.getSquare(-3.0), 0.1);
        assertEquals(0.0625, getSquare1.getSquare(-0.25), 0.1);
        assertEquals(0.0, getSquare1.getSquare(0.0), 0.1);
    }

    @Test
    public void testGetSquareRoot() {
        MainApplication getSquareRoot1 = new MainApplication();
        assertEquals(4.0, getSquareRoot1.getSquareRoot(16.0), 0.1);
        assertEquals(0.0, getSquareRoot1.getSquareRoot(0.0), 0.1);
    }

    @Test
    public void testGetExponentiation() {
        MainApplication getExponentiation1 = new MainApplication();
        assertEquals(8.0, getExponentiation1.getExponentiation(2.0, 3.0), 0.1);
        assertEquals(-8.0, getExponentiation1.getExponentiation(-2.0, 3.0), 0.1);
        assertEquals(0.125, getExponentiation1.getExponentiation(2.0, -3.0), 0.1);
        assertEquals(0.0, getExponentiation1.getExponentiation(0.0, 2.0), 0.1);
        assertEquals(2.0, getExponentiation1.getExponentiation(4.0, 0.5), 0.1);
        assertEquals(0.5, getExponentiation1.getExponentiation(4.0, -0.5), 0.1);
        assertEquals(1.0, getExponentiation1.getExponentiation(1.0, 0.0), 0.1);
        assertEquals(0.0, getExponentiation1.getExponentiation(0.0, 1.0), 0.1);
     }

    @Test
    public void testGetInverse() {
        MainApplication getInverse1 = new MainApplication();
        assertEquals(0.25, getInverse1.getInverse(4.0), 0.1);
        assertEquals(-0.25, getInverse1.getInverse(-4.0), 0.1);
        assertEquals(.01, getInverse1.getInverse(100), 0.1);

     }

}

