package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.SimpleMath;
import org.junit.Assert;


public class TestSimpleMath {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception{

    }

    @org.junit.Test
    public void testSimpleMathAdd() {

        SimpleMath add1 = new SimpleMath();
        Assert.assertEquals(20, add1.add(10, 10), 0.00);
        Assert.assertEquals(56.50, add1.add(20.25, 36.25), 0.00);
        Assert.assertEquals(357, add1.add(206, 151), 0.00);
        Assert.assertEquals(652.27, add1.add(563.25, 89.02), 0.00);
    }

    @org.junit.Test
    public void testSimpleMathSub(){

        SimpleMath sub1 = new SimpleMath();
        Assert.assertEquals(15, sub1.subtract(20, 5), 0.00);
        Assert.assertEquals(378, sub1.subtract(456, 78), 0.00);
        Assert.assertEquals(55.64, sub1.subtract(89.67, 34.03), 0.00);
        Assert.assertEquals(28, sub1.subtract(37,9), 0.00);

    }

    @org.junit.Test
    public void testSimpleMathMul(){

        SimpleMath mul1 = new SimpleMath();
        Assert.assertEquals(81, mul1.multiplication(9,9), 0.00);
        Assert.assertEquals(150.4, mul1.multiplication(37.6,4), 0.00);
        Assert.assertEquals(120, mul1.multiplication(30,4), 0.00);
        Assert.assertEquals(950, mul1.multiplication(100,9.5), 0.00);

    }

    @org.junit.Test
    public void testSimpleMathDiv(){

        SimpleMath div1 = new SimpleMath();
        Assert.assertEquals(125, div1.division(250, 2), 0.00);
        Assert.assertEquals(14.383333333333333, div1.division(86.3, 6), 0.00);
        Assert.assertEquals(18.666666666666668, div1.division(56, 3), 0.00);
        Assert.assertEquals(3, div1.division(21, 7), 0.00);

    }


    @org.junit.Test
    public void testSimpleMathSq() {

        SimpleMath square1 = new SimpleMath();
        Assert.assertEquals(4, square1.square(2), 0.00);
        Assert.assertEquals(625, square1.square(25), 0.00);
        Assert.assertEquals(529, square1.square(23), 0.00);
        Assert.assertEquals(90.25, square1.square(9.5), 0.00);

    }

    @org.junit.Test
    public void testSimpleMathSqRt() {

        SimpleMath sqRoot1 = new SimpleMath();
        Assert.assertEquals(7, sqRoot1.squareRoot(49), 0.00);
        Assert.assertEquals(4.878524367060187, sqRoot1.squareRoot(23.8), 0.00);
        Assert.assertEquals(10.099504938362077, sqRoot1.squareRoot(102), 0.00);
        Assert.assertEquals(1.449137674618944, sqRoot1.squareRoot(2.1), 0.00);
    }

    @org.junit.Test
    public void testSimpleMathExpo() {

        SimpleMath expo1 = new SimpleMath();
        Assert.assertEquals(1000, expo1.expo(10, 3), 0.00);
        Assert.assertEquals(97.65625, expo1.expo(2.5, 5), 0.00);
        Assert.assertEquals(64, expo1.expo(2, 6), 0.00);
        Assert.assertEquals(300.76300000000003, expo1.expo(6.7, 3), 0.00);
    }

    @org.junit.Test
    public void testSimpleMathInverse() {

        SimpleMath inverse1 = new SimpleMath();
        Assert.assertEquals(0.125, inverse1.inverse(8), 0.00);
        Assert.assertEquals(0.16129032258064516, inverse1.inverse(6.2), 0.00);
        Assert.assertEquals(0.043478260869565216, inverse1.inverse(23), 0.00);
        Assert.assertEquals(0.998003992015968, inverse1.inverse(1.002), 0.00);
    }

    @org.junit.Test
    public void testSimpleMathInvertSign() {

        SimpleMath sign1 = new SimpleMath();
        Assert.assertEquals(- 9, sign1.invertSign(9), 0.00);
        Assert.assertEquals(56, sign1.invertSign(- 56), 0.00);
        Assert.assertEquals(- 123.34, sign1.invertSign(123.34), 0.00);
        Assert.assertEquals(34.02, sign1.invertSign(- 34.02), 0.00);

    }



}




