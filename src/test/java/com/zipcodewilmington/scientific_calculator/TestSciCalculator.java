package com.zipcodewilmington.scientific_calculator;

import org.junit.Assert;
import org.junit.Test;

import static com.zipcodewilmington.scientificcalculator.SciCalculator.*;

public class TestSciCalculator
{
    @Test
    public void testSine1() {
        String expected = "-0.9880316240928618";
        String actual = sine(30, true);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSine2() {
        String expected = "0.8509035245341184";
        String actual = sine(45, true);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSine3() {
        String expected = "-0.3048106211022167";
        String actual = sine(60, true);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcosine1() {
        String expected = "0.15425144988758405";
        String actual = cosine(30, true);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testcosine2() {
        String expected = "0.5253219888177297";
        String actual = cosine(45, true);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testcosine3() {
        String expected = "-0.9524129804151563";
        String actual = cosine(60, true);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testtangent1() {
        String expected = "-6.405331196646276";
        String actual = tangent(30, true);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testtangent2() {
        String expected = "1.6197751905438615";
        String actual = tangent(45, true);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testtangent3() {
        String expected = "0.320040389379563";
        String actual = tangent(60, true);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcsc1() {
        String expected = "0.0";
        String actual = csc(0, true);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testcsc2() {
        String expected = "0.5235987755982989";
        String actual = csc(0.5, true);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testcsc3() {
        String expected = "NaN";
        String actual = csc(2, true);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testsec1() {
        String expected = "0.0";
        String actual = sec(1, true);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testsec2() {
        String expected = "1.5707963267948966";
        String actual = sec(0, true);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testsec3() {
        String expected = "3.141592653589793";
        String actual = sec(-1, true);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcotan1() {
        String expected = "1.5374753309166493";
        String actual = cotan(30, true);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testcotan2() {
        String expected = "1.5485777614681775";
        String actual = cotan(45, true);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testcotan3() {
        String expected = "1.554131203080956";
        String actual = cotan(60, true);
        Assert.assertEquals(expected, actual);
    }

    public void testlog1() {
        String expected = "0.6931471805599453";
        String actual = log(2);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testLog2(){
        String expected = "-Infinity";
        String actual = log(0);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testLog3(){
        String expected = "NaN";
        String actual = log(-1);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testLog101(){
        String expected = "2.0";
        String actual = log10(100);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testLog102(){
        String expected = "NaN";
        String actual = log10(-1);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testLog103(){
        String expected = "-Infinity";
        String actual = log10(0);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testFactorial1() {
        String expected = "24.0";
        String actual = factorial(-4);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFactorial2() {
        String expected = "-6.0";
        String actual = factorial(-3);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFactorial3() {
        String expected = "720.0";
        String actual = factorial(6);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFactorial4() {
        String expected = "24.0";
        String actual = factorial(4.2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSwitchDisplayMode1() {
        String expected = "octal";
        String actual = switchDisplayMode("binary", "disp");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSwitchDisplayMode2() {
        String expected = "binary";
        String actual = switchDisplayMode("hexadecimal", "disp");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSwitchDisplayMode3() {
        String expected = "octal";
        String actual = switchDisplayMode("decimal", "disp oct");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSwitchDisplayMode4() {
        String expected = "hexadecimal";
        String actual = switchDisplayMode("decimal", "disp hex");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSwitchDisplayMode5() {
        String expected = "decimal";
        String actual = switchDisplayMode("binary", "disp dec");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConvertNumberToMode1() {
        String expected = "11111111111111111111111100010110";
        String actual = convertNumberToMode("-234.4", "binary");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConvertNumberToMode2() {
        String expected = "-234.4";
        String actual = convertNumberToMode("-234.4", "decimal");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConvertNumberToMode3() {
        String expected = "ffffffff";
        String actual = convertNumberToMode("-1", "hexadecimal");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConvertNumberToMode4() {
        String expected = "27";
        String actual = convertNumberToMode("23", "octal");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConvertNumberToMode5() {
        String expected = "1100100";
        String actual = convertNumberToMode("100", "binary");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConvertNumberToMode6() {
        String expected = "22";
        String actual = convertNumberToMode("34", "hexadecimal");
        Assert.assertEquals(expected, actual);
    }
}
