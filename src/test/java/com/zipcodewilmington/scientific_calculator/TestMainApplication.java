package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    @Test
    public void test1() {
        Calculator c1 = new Calculator();
        assertEquals(55.0, c1.add(10.0, 45.0), 0.01);
        assertEquals(2.0, c1.add(-5.0, 7.0), 0.01);
        assertEquals(-290.0, c1.add(-25.0, -265.0), 0.01);
        assertEquals(100012345.0, c1.add(100000000, 12345.0), 0.01);
        assertEquals(110.69, c1.add(23.567, 87.123), 0.01);
    }
    @Test
    public void test2() {
        Calculator c1 = new Calculator();
        assertEquals(-35.0, c1.subtract(10.0, 45.0), 0.01);
        assertEquals(-12.0 ,c1.subtract(-5.0, 7.0), 0.01);
        assertEquals(240.0 ,c1.subtract(-25.0, -265.0), 0.01);
        assertEquals(-33.15 ,c1.subtract(34.678, 67.832), 0.01);
        assertEquals(-63.556 ,c1.subtract(23.567, 87.123), 0.01);
    }
    @Test
    public void test3()
    {
        Calculator c1 = new Calculator();
        assertEquals(50.0 ,c1.multiply(10.0, 5.0), 0.01);
        assertEquals(-53.0 ,c1.multiply(-10.0, 5.3), 0.01);
        assertEquals(45.27 ,c1.multiply(1.002, 45.180), 0.01);
        assertEquals(203.205 ,c1.multiply(-34.50, -5.89), 0.01);
        assertEquals(60.795 ,c1.multiply(0.579, 105.0), 0.01);
    }
    @Test
    public void test4()
    {
        Calculator c1 = new Calculator();
        assertEquals(2.0, c1.divide(10.0, 5.0), 0.01);
        assertEquals(3.114, c1.divide(106.0, 34.04), 0.01);
        assertEquals(-31.267, c1.divide(-23.45, 0.75), 0.01);
        assertEquals(3.0, c1.divide(0.75, 0.25), 0.01);
        assertEquals(300.0, c1.divide(.09, 0.0003), 0.01);
    }
    @Test
    public void test5()
    {
        Calculator c1 = new Calculator();
        assertEquals(25.0, c1.square( 5.0), 0.01);
        assertEquals(1.0, c1.square( 1.0), 0.01);
        assertEquals(25.0, c1.square( -5.0), 0.01);
        assertEquals(0.1369, c1.square( 0.370), 0.01);
        assertEquals(1000000.0, c1.square( 1000.0), 0.01);
    }
    @Test
    public void test6() {
        Calculator c1 = new Calculator();
        assertEquals(5.0, c1.squareRoot(25.0), 0.01);
        assertEquals(Double.NaN, c1.squareRoot(-1.0), 0.01);
        assertEquals(1.0, c1.squareRoot(1.0), 0.01);
        assertEquals(12.0, c1.squareRoot(144.0), 0.01);
        assertEquals(31.623, c1.squareRoot(1000.0), 0.01);
    }
    @Test
    public void test7() {
        Calculator c1 = new Calculator();
        assertEquals(32.0, c1.exponent(2.0, 5.0), 0.01);
        assertEquals(0.03125, c1.exponent(2.0, -5.0), 0.01);
        assertEquals(1.189, c1.exponent(2.0, 0.25), 0.01);
        assertEquals(0.01, c1.exponent(10.0, -2.0), 0.01);
        assertEquals(282475249.0, c1.exponent(7.0, 10.0), 0.01);
    }
    @Test
    public void test8() {
        Calculator c1 = new Calculator();
        assertEquals(0.01, c1.inverse(100.0), 0.01);
        assertEquals(0.04, c1.inverse(25.0), 0.01);
        assertEquals(2.0, c1.inverse(0.5), 0.01);
        assertEquals(-0.0435, c1.inverse(-23.0), 0.01);
        assertEquals(0.08734, c1.inverse(11.45), 0.01);
    }
    @Test
    public void test9() {
        Calculator c1 = new Calculator();
        assertEquals(-7.0, c1.signSwitch(7.0), 0.01);
        assertEquals(7.0, c1.signSwitch(-7.0), 0.01);
        assertEquals(-0.04, c1.signSwitch(0.04), 0.01);
        assertEquals(4.67, c1.signSwitch(-4.67), 0.01);
        assertEquals(67.89, c1.signSwitch(-67.89), 0.01);
    }
    @Test
    public void test10() {
        Calculator c1 = new Calculator();
        assertEquals(0.0, c1.sin(0.0), 0.01);
        assertEquals(-0.468, c1.sin(500.0), 0.01);
        assertEquals(-0.894, c1.sin(-90.0), 0.01);
        assertEquals(0.102, c1.sin(75.5), 0.01);
        assertEquals(-0.851, c1.sin(-310.0), 0.01);
    }

    @Test
    public void test11() {
        Calculator c1 = new Calculator();
        assertEquals(0.154, c1.cos(30.0), 0.01);
        assertEquals(1.0, c1.cos(0.0), 0.01);
        assertEquals(0.814, c1.cos(-120.0), 0.01);
        assertEquals(-0.884, c1.cos(500.0), 0.01);
        assertEquals( -0.839, c1.cos(-10.0), 0.01);
    }

    @Test
    public void test12() {
        Calculator c1 = new Calculator();
        assertEquals(0.0, c1.tangent(0.0), 0.01);
        assertEquals( 0.713, c1.tangent(120.0), 0.01);
        assertEquals(0.134, c1.tangent(-25.0), 0.01);
        assertEquals(-0.074, c1.tangent( 65.9), 0.01);
        assertEquals(-3.38, c1.tangent(360.0), 0.01);

    }

    @Test
    public void test13() {
        Calculator c1 = new Calculator();
        assertEquals(Double.NaN, c1.InverseSin(30.0), 0.01);
        assertEquals(1.571, c1.InverseSin(1.0), 0.01);
        assertEquals(0.644, c1.InverseSin(0.6), 0.01);
        assertEquals(-0.253, c1.InverseSin(-0.25), 0.01);
        assertEquals(0.0, c1.InverseSin(0.0), 0.01);
    }
    @Test
    public void test14() {
        Calculator c1 = new Calculator();
        assertEquals(Double.NaN, c1.InverseCos(30.0), 0.01);
        assertEquals(2.587, c1.InverseCos(-0.85), 0.01);
        assertEquals(0.00, c1.InverseCos(1.0), 0.01);
        assertEquals(1.17, c1.InverseCos(0.39), 0.01);
        assertEquals(2.214, c1.InverseCos(-0.60), 0.01);
    }
    @Test
    public void test15() {
        Calculator c1 = new Calculator();
        assertEquals(1.537, c1.InverseTangent(30.0), 0.01);
        assertEquals(0.785, c1.InverseTangent(1.0), 0.01);
        assertEquals(1.554, c1.InverseTangent(60.0), 0.01);
        assertEquals(1.559, c1.InverseTangent(90.0), 0.01);
        assertEquals(-1.559, c1.InverseTangent(-84.0), 0.01);
    }
    @Test
    public void test16() {
        Calculator c1 = new Calculator();
        assertEquals(4.499, c1.log(90.0), 0.01);
        assertEquals(0.0, c1.log(1.0), 0.01);
        assertEquals(Double.NaN, c1.log(-60.0), 0.01);
        assertEquals(3.912, c1.log(50.0), 0.01);
        assertEquals(9.210, c1.log(10000.0), 0.01);
    }
    @Test
    public void test17() {
        Calculator c1 = new Calculator();
        assertEquals(1.954, c1.log10X(90.0), 0.01);
        assertEquals(0.0, c1.log10X(1.0), 0.01);
        assertEquals(Double.NaN, c1.log10X(-60.0), 0.01);
        assertEquals(1.699, c1.log10X(50.0), 0.01);
        assertEquals(4.0, c1.log10X(10000.0), 0.01);
    }
    @Test
    public void test18() {
        Calculator c1 = new Calculator();
        assertEquals(100.00, c1.invLog(2.0), 0.01);
        assertEquals(1.0E25, c1.invLog(25.0), 0.01);
        assertEquals(1.778, c1.invLog(0.25), 0.01);
        assertEquals(0.00001, c1.invLog(-5.0), 0.01);
        assertEquals(1.002, c1.invLog(0.001), 0.01);
    }
    @Test
    public void test19() {
        Calculator c1 = new Calculator();
        assertEquals(148.41, c1.invNatLog(5.0), 0.01);
        assertEquals(2.718, c1.invNatLog(1.0), 0.01);
        assertEquals(0.0067, c1.invNatLog(-5.0), 0.01);
        assertEquals(1.994, c1.invNatLog(0.69), 0.01);
        assertEquals(22026.466, c1.invNatLog(10.0), 0.01);
    }
    @Test
    public void test20() {
        Calculator c1 = new Calculator();
        assertEquals(720.0, c1.factorial(6.0), 0.01);
        assertEquals(Double.NaN, c1.factorial(-1.0), 0.01);
        assertEquals(1.0, c1.factorial(1.0), 0.01);
        assertEquals(1.5511210043330986E25, c1.factorial( 25), 0.01);
        assertEquals(1.0, c1.factorial(0), 0.01);
    }
    @Test
    public void test21() {
        Calculator c1 = new Calculator();
        assertEquals("ff", c1.DecimalToOther(255, 16));
        assertEquals("1f4", c1.DecimalToOther(500, 16));
        assertEquals("1", c1.DecimalToOther(1, 16));
        assertEquals("-5a", c1.DecimalToOther(-90, 16));
        assertEquals("19", c1.DecimalToOther(25, 16));
    }
    @Test
    public void test22() {
        Calculator c1 = new Calculator();
        assertEquals("10", c1.DecimalToOther(2, 2));
    }
    @Test
    public void test23() {
        Calculator c1 = new Calculator();
        assertEquals(3.14, c1.toRadians(180), 0.01);
    }
    @Test
    public void test24() {
        Calculator c1 = new Calculator();
        assertEquals(180.00, c1.toDegrees(Math.PI), 0.001);
    }
    @Test
    public void test25() {
        Calculator c1 = new Calculator();
        assertEquals(73.00, c1.secretof73(8419), 0.001);
    }
}