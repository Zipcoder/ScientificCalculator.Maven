package com.zipcodewilmington.scientific_calculator;


import com.zipcodewilmington.scientificcalculator.CoreMethods;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    private final CoreMethods testMethods = new CoreMethods();

    @Test
    public void testcalcAdd() {
        //given
        double a = 2;
        double b = 5;
        double expected = a + b;
        // when

        //then
        double outcome = testMethods.calcAdd(a, b);
        Assert.assertEquals(expected, outcome, 00);

    }

    @Test
    public void testcalcAdd1() {
        //given
        double a = 4;
        double b = 8;
        double expected = a + b;
        // when

        //then
        double outcome = testMethods.calcAdd(a, b);
        Assert.assertEquals(expected, outcome, 00);

    }

    @Test
    public void testcalcAdd2() {
        //given
        double a = 3;
        double b = 7;
        double expected = a + b;
        // when

        //then
        double outcome = testMethods.calcAdd(a, b);
        Assert.assertEquals(expected, outcome, 00);

    }

    @Test
    public void testcalcSub() {
        //given
        double a = 3;
        double b = 1;
        double expected = a - b;
        // when

        //then
        double outcome = testMethods.calcSub(a, b);
        Assert.assertEquals(expected, outcome, 00);

    }

    @Test
    public void testcalcSub1() {
        //given
        double a = 7;
        double b = 5;
        double expected = a - b;
        // when

        //then
        double outcome = testMethods.calcSub(a, b);
        Assert.assertEquals(expected, outcome, 00);

    }

    @Test
    public void testcalcSub2() {
        //given
        double a = 6;
        double b = 3;
        double expected = a - b;
        // when

        //then
        double outcome = testMethods.calcSub(a, b);
        Assert.assertEquals(expected, outcome, 00);

    }

    @Test
    public void testcalcPosNeg() {
        //given
        double a = 10;
        // when
        double expected = a * -1;
        //then
        double outcome = testMethods.calcPosNeg(a);
        Assert.assertEquals(expected, outcome, 00);

    }

    @Test
    public void testcalcPosNeg1() {
        //given
        double a = 20;
        // when
        double expected = a * -1;
        //then
        double outcome = testMethods.calcPosNeg(a);
        Assert.assertEquals(expected, outcome, 00);

    }

    @Test
    public void testcalcPosNeg2() {
        double a = 3;
        // when
        double expected = a * -1;
        //then
        double outcome = testMethods.calcPosNeg(a);
        Assert.assertEquals(expected, outcome, 00);
    }

    @Test
    public void testcalcMultiply() {
        //given
        double a = 2;
        double b = 4;
        double expected = a * b;
        //when
        double outcome = (double) testMethods.calcMultiply(a, b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }


    @Test
    public void testcalcMultiply2() {
        //given
        double a = 5;
        double b = 5;
        double expected = 5 * 5;
        //when
        double outcome = (double) testMethods.calcMultiply(a, b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    @Test
    public void testcalcMultiply3() {
        //given
        double a = 10;
        double b = 5;
        double expected = 10 * 5;
        //when
        double outcome = testMethods.calcMultiply(a, b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    //TESTING THE SQUARE OF A NUMBER
    @Test
    public void testcalcSquared() {
        //given
        double a = 10;
        double expected = 10 * 10;
        //when
        double outcome = testMethods.calcSquared(a);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    @Test
    public void testcalcSquared2() {
        //given
        double a = 5;
        double expected = 5 * 5;
        //when
        double outcome = (double) testMethods.calcSquared(a);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    @Test
    public void testcalcSquared3() {
        //given
        double a = 2;
        double expected = 4;
        //when
        double outcome = (double) testMethods.calcSquared(a);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    //TESTING TO THE POWER

    @Test
    public void testcalcToPower() {
        //given
        double a = 2;
        double b = 2;
        double expected = 4;
        //when
        double outcome = (double) testMethods.calcToPower(a, b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    @Test
    public void testcalcToPower2() {
        //given
        double a = 5;
        double b = 5;
        double expected = 3125;
        //when
        double outcome = testMethods.calcToPower(a, b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    @Test
    public void testcalcToPower3() {
        //given
        double a = 4;
        double b = 3;
        double expected = 64;
        //when
        double outcome = (double) testMethods.calcToPower(a, b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    @Test
    public void testcalcDiv() {
        //given
        double a = 100;
        double b = 10;
        double expected = a / b;
        //when
        double outcome = testMethods.calcDiv(a, b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    @Test
    public void testcalcDiv1() {
        //given
        double a = 9;
        double b = 3;
        double expected = a / b;
        //when
        double outcome = testMethods.calcDiv(a, b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    @Test
    public void testcalcDiv2() {
        //given
        double a = 15;
        double b = 5;
        double expected = a / b;
        //when
        double outcome = testMethods.calcDiv(a, b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    @Test
    public void testcalcSqrt() {
        //given
        double a = 100;
        Double expected = Math.sqrt(a);
        //when
        Double outcome = testMethods.calcSqrt(a);
        //then
        Assert.assertEquals(expected, outcome);
    }

    @Test
    public void testcalcSqrt1() {
        //given
        double a = 25;
        Double expected = Math.sqrt(a);
        //when
        Double outcome = testMethods.calcSqrt(a);
        //then
        Assert.assertEquals(expected, outcome);
    }

    @Test
    public void testcalcSqrt2() {
        //given
        double a = 64;
        Double expected = Math.sqrt(a);
        //when
        Double outcome = testMethods.calcSqrt(a);
        //then
        Assert.assertEquals(expected, outcome);
    }

    @Test
    public void testcalcInverse() {
        //given
        double a = 20;
        Double expected = 1 / a;
        //when
        Double outcome = testMethods.calcInverse(a);
        //then
        Assert.assertEquals(expected, outcome);
    }

    @Test
    public void testcalcInverse1() {
        //given
        double a = 5;
        Double expected = 1 / a;
        //when
        Double outcome = testMethods.calcInverse(a);
        //then
        Assert.assertEquals(expected, outcome);
    }

    @Test
    public void testcalcInverse2() {
        //given
        double a = 10;
        Double expected = 1 / a;
        //when
        Double outcome = testMethods.calcInverse(a);
        //then
        Assert.assertEquals(expected, outcome);
    }

}