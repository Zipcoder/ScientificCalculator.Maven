package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Calculator;
import static org.junit.Assert.*;
/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    @org.junit.Before
    public void setUp() throws Exception {
    }
    @org.junit.After
    public void tearDown() throws Exception {
    }
    @org.junit.Test
    public void testAddition() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(4.0), myCalc.addition(2,2), 0.00001);
        assertEquals(Double.valueOf(100.0), myCalc.addition(79,21), 0.00001);
        assertEquals(Double.valueOf(4.0), myCalc.addition(6,-2), 0.00001);
    }
    @org.junit.Test
    public void testSubtraction() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(4.0), myCalc.subtraction(6,2), 0.00001);
        assertEquals(Double.valueOf(-20.0), myCalc.subtraction(70,90), 0.00001);
        assertEquals(Double.valueOf(4.0), myCalc.subtraction(2,-2), 0.00001);
    }
    @org.junit.Test
    public void testMultiply() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(18.0), myCalc.multiply(6,3), 0.00001);
        assertEquals(Double.valueOf(-4.0), myCalc.multiply(-2,2), 0.00001);
        assertEquals(Double.valueOf(144.0), myCalc.multiply(12,12), 0.00001);
    }
    @org.junit.Test
    public void testDivide() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(1.0), myCalc.divide(2,2), 0.00001);
        assertEquals(Double.valueOf(2.0), myCalc.divide(8,4), 0.00001);
        assertEquals(Double.valueOf(0.25), myCalc.divide(1,4), 0.00001);
    }
    @org.junit.Test
    public void testExponential() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(9.0), myCalc.exponential(3,2), 0.00001);
        assertEquals(Double.valueOf(8.0), myCalc.exponential(2,3), 0.00001);
        assertEquals(Double.valueOf(1.0), myCalc.exponential(2,0), 0.00001);
    }
    @org.junit.Test
    public void testSquare() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(4.0), myCalc.square(2), 0.00001);
        assertEquals(Double.valueOf(1.0), myCalc.square(1), 0.00001);
        assertEquals(Double.valueOf(1600.0), myCalc.square(40), 0.00001);
    }
    @org.junit.Test
    public void testSquareRoot() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(1.41421), myCalc.squareRoot(2), 0.00001);
        assertEquals(Double.valueOf(2.0), myCalc.squareRoot(4), 0.00001);
        assertEquals(Double.valueOf(4.0), myCalc.squareRoot(16), 0.00001);
    }
    @org.junit.Test
    public void testInverse() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(0.5), myCalc.inverse(2), 0.00001);
        assertEquals(Double.valueOf(2.0), myCalc.inverse(0.5), 0.00001);
        assertEquals(Double.valueOf(0.1), myCalc.inverse(10), 0.00001);
    }
    @org.junit.Test
    public void testInvert() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(-2.0), myCalc.invert(2), 0.00001);
        assertEquals(Double.valueOf(3.0), myCalc.invert(-3), 0.00001);
        assertEquals(Double.valueOf(0.0), myCalc.invert(0), 0.00001);
    }
    @org.junit.Test
    public void testSine() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(0), myCalc.sine(0), 0.00001);
        assertEquals(Double.valueOf(0.84147), myCalc.sine(1), 0.00001);
        assertEquals(Double.valueOf(0.9093), myCalc.sine(2), 0.00001);
    }
    @org.junit.Test
    public void testCosine() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(1.0), myCalc.cosine(0), 0.00001);
        assertEquals(Double.valueOf(0.5403), myCalc.cosine(1), 0.00001);
        assertEquals(Double.valueOf(-0.41615), myCalc.cosine(2), 0.00001);
    }
    @org.junit.Test
    public void testTangent() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(0.0), myCalc.tangent(0), 0.00001);
        assertEquals(Double.valueOf(1.55741), myCalc.tangent(1), 0.00001);
        assertEquals(Double.valueOf(-2.18504), myCalc.tangent(2), 0.00001);
    }
    @org.junit.Test
    public void testInverseSine() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(-1.5708), myCalc.inverseSine(-1), 0.00001);
        assertEquals(Double.valueOf(0.0), myCalc.inverseSine(0), 0.00001);
        assertEquals(Double.valueOf(1.5708), myCalc.inverseSine(1), 0.00001);
    }
    @org.junit.Test
    public void testInverseCosine() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(3.14159), myCalc.inverseCosine(-1), 0.00001);
        assertEquals(Double.valueOf(1.5708), myCalc.inverseCosine(0), 0.00001);
        assertEquals(Double.valueOf(0.0), myCalc.inverseCosine(1), 0.00001);
    }
    @org.junit.Test
    public void testInverseTangent() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(-0.7854), myCalc.inverseTangent(-1), 0.00001);
        assertEquals(Double.valueOf(0.0), myCalc.inverseTangent(0), 0.00001);
        assertEquals(Double.valueOf(0.7854), myCalc.inverseTangent(1), 0.00001);
    }
    @org.junit.Test
    public void testFactorial() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(2.0), myCalc.factorial(2), 0.00001);
        assertEquals(Double.valueOf(6.0), myCalc.factorial(3), 0.00001);
        assertEquals(Double.valueOf(362880.0), myCalc.factorial(9), 0.00001);
    }
    @org.junit.Test
    public void testLog() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(0.0), myCalc.log(1), 0.00001);
        assertEquals(Double.valueOf(0.30103), myCalc.log(2), 0.00001);
        assertEquals(Double.valueOf(1.0), myCalc.log(10), 0.00001);
    }
    @org.junit.Test
    public void testInverseLog() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(1.0), myCalc.inverseLog(0), 0.00001);
        assertEquals(Double.valueOf(2.0), myCalc.inverseLog(0.30103), 0.00001);
        assertEquals(Double.valueOf(10.0), myCalc.inverseLog(1), 0.00001);
    }
    @org.junit.Test
    public void testNaturalLog() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(0.0), myCalc.naturalLog(1), 0.00001);
        assertEquals(Double.valueOf(2.30259), myCalc.naturalLog(10), 0.00001);
        assertEquals(Double.valueOf(0.69315), myCalc.naturalLog(2), 0.00001);
    }
    @org.junit.Test
    public void testInverseNaturalLog() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(1.0), myCalc.inverseNaturalLog(0), 0.0001);
        assertEquals(Double.valueOf(10.0), myCalc.inverseNaturalLog(2.30259), 0.0001);
        assertEquals(Double.valueOf(2.0), myCalc.inverseNaturalLog(0.69315), 0.0001);
    }    @org.junit.Test
    public void testConvertFtoC() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(32.22222), myCalc.convertFtoC(90), 0.0001);
        assertEquals(Double.valueOf(5), myCalc.convertFtoC(41), 0.0001);
        assertEquals(Double.valueOf(-17.77778), myCalc.convertFtoC(0), 0.0001);
    }
    @org.junit.Test
    public void testConvertCtoF() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(90), myCalc.convertCtoF(32.22222), 0.0001);
        assertEquals(Double.valueOf(41), myCalc.convertCtoF(5), 0.0001);
        assertEquals(Double.valueOf(0), myCalc.convertCtoF(-17.77778), 0.0001);
    }
    @org.junit.Test
    public void testConvertLBtoKG() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(0.45359), myCalc.convertLBtoKG(1), 0.0001);
        assertEquals(Double.valueOf(10.43262), myCalc.convertLBtoKG(23), 0.0001);
        assertEquals(Double.valueOf(206.8381), myCalc.convertLBtoKG(456), 0.0001);
    }
    @org.junit.Test
    public void testConvertKGtoLB() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(1), myCalc.convertKGtoLB(0.45359), 0.0001);
        assertEquals(Double.valueOf(23), myCalc.convertKGtoLB(10.43262), 0.0001);
        assertEquals(Double.valueOf(456), myCalc.convertKGtoLB(206.8381), 0.0001);
    }
    @org.junit.Test
    public void testToRadians() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(0), myCalc.toRadians(0), 0.0001);
        assertEquals(Double.valueOf(1.5708), myCalc.toRadians(90), 0.0001);
        assertEquals(Double.valueOf(3.14159), myCalc.toRadians(180), 0.0001);
    }
    @org.junit.Test
    public void testToDegrees() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(0), myCalc.toDegrees(0), 0.001);
        assertEquals(Double.valueOf(90), myCalc.toDegrees(1.5708), 0.001);
        assertEquals(Double.valueOf(180), myCalc.toDegrees(3.14159), 0.001);
    }
    /*@org.junit.Test
    public void testDecToBinary() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(10), myCalc.decToBinary(2));
        assertEquals(Double.valueOf(1), myCalc.decToBinary(1));
        assertEquals(Double.valueOf(1000), myCalc.decToBinary(8));
    }
    @org.junit.Test
    public void testDecToOct() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(2), myCalc.decToOct(2));
        assertEquals(Double.valueOf(10), myCalc.decToOct(8));
        assertEquals(Double.valueOf(170), myCalc.decToOct(120));
    }
    @org.junit.Test
    public void testDecToHex() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(2), myCalc.decToHex(2));
        assertEquals(Double.valueOf(14), myCalc.decToHex(20));
        assertEquals("1f", myCalc.decToHex(31));
    }
    @org.junit.Test
    public void testBinaryToDec() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(2), myCalc.binaryToDec(10));
        assertEquals(Double.valueOf(1), myCalc.binaryToDec(1));
        assertEquals(Double.valueOf(8), myCalc.binaryToDec(1000));
    }
    @org.junit.Test
    public void testBinaryToOct() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(2), myCalc.binaryToOct(10));
        assertEquals(Double.valueOf(17), myCalc.binaryToOct(1111));
        assertEquals(Double.valueOf(10), myCalc.binaryToOct(1000));
    }
    @org.junit.Test
    public void testBinaryToHex() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(2), myCalc.binaryToHex(10));
        assertEquals(Double.valueOf(10), myCalc.binaryToHex(10000));
        assertEquals("1f", myCalc.binaryToHex(11111));
    }
    @org.junit.Test
    public void testOctToBinary() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(10), myCalc.octToBinary(2));
        assertEquals(Double.valueOf(1), myCalc.octToBinary(1));
        assertEquals(Double.valueOf(1000), myCalc.octToBinary(10));
    }
    @org.junit.Test
    public void testOctToDec() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(2), myCalc.octToDec(2));
        assertEquals(Double.valueOf(8), myCalc.octToDec(10));
        assertEquals(Double.valueOf(120), myCalc.octToDec(170));
    }
    @org.junit.Test
    public void testOctToHex() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(2), myCalc.octToHex(2));
        assertEquals("e", myCalc.octToHex(16));
        assertEquals(Double.valueOf(19), myCalc.octToHex(31));
    }
    @org.junit.Test
    public void testHexToBinary() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(2), myCalc.hexToBinary(2));
        assertEquals(Double.valueOf(15), myCalc.hexToBinary("f"));
        assertEquals(Double.valueOf(171), myCalc.hexToBinary("ab"));
    }
    @org.junit.Test
    public void testHexToOct() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(2), myCalc.hexToOct(2));
        assertEquals(Double.valueOf(17), myCalc.hexToOct("f"));
        assertEquals(Double.valueOf(252), myCalc.hexToOct("ab"));
    }
    @org.junit.Test
    public void testHexToDec() {
        Calculator myCalc = new Calculator();
        assertEquals(Double.valueOf(10), myCalc.hexToDec(2));
        assertEquals(Double.valueOf(1111), myCalc.hexToDec("f"));
        assertEquals(Double.valueOf(10101011), myCalc.hexToDec("ab"));
    }*/
}