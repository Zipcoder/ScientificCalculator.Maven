package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.ConversionCalculator;
import com.zipcodewilmington.scientificcalculator.ScientificCalculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ConversionCalcTests {

    private ConversionCalculator cCalc;

    @Before
    public void setup(){
        cCalc = new ConversionCalculator();

    }


    @Test
    public void binaryTest1(){

        cCalc.binary(10);

        Assert.assertEquals("test", "1010", cCalc.getStringResult());
    }

    @Test
    public void binaryTest2(){

        cCalc.binary(12);

        Assert.assertEquals("test", "1100", cCalc.getStringResult());
    }


    @Test
    public void binaryTest3(){

        cCalc.binary(15);

        Assert.assertEquals("test", "1111", cCalc.getStringResult());
    }


    @Test
    public void octalTest1(){

        cCalc.octal(12);

        Assert.assertEquals("test", "14", cCalc.getStringResult());
    }

    @Test
    public void octalTest2(){

        cCalc.octal(15);

        Assert.assertEquals("test", "17", cCalc.getStringResult());
    }

    @Test
    public void octalTest3(){

        cCalc.octal(18);

        Assert.assertEquals("test", "22", cCalc.getStringResult());
    }

    @Test
    public void decimalTest1(){

        cCalc.decimal(12);

        Assert.assertEquals("test", "12.0", cCalc.getStringResult());
    }

    @Test
    public void decimalTest2(){

        cCalc.decimal(125);

        Assert.assertEquals("test", "125.0", cCalc.getStringResult());
    }

    @Test
    public void decimalTest3(){

        cCalc.decimal(1250);

        Assert.assertEquals("test", "1250.0", cCalc.getStringResult());
    }

    @Test
    public void hexaDecimalTest1(){

        cCalc.hexadecimal(30);

        Assert.assertEquals("test", "1e", cCalc.getStringResult());
    }

    @Test
    public void hexaDecimalTest2(){

        cCalc.hexadecimal(25);

        Assert.assertEquals("test", "19", cCalc.getStringResult());
    }

    @Test
    public void hexaDecimalTest3(){

        cCalc.hexadecimal(30);

        Assert.assertEquals("test", "1e", cCalc.getStringResult());
    }
}
