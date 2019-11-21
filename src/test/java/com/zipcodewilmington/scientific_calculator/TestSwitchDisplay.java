package com.zipcodewilmington.scientific_calculator;


import com.zipcodewilmington.scientificcalculator.SwitchDisplay;
import org.junit.Assert;

public class TestSwitchDisplay {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception{

    }


    @org.junit.Test
    public void testSwitchDisplayBinary(){

        SwitchDisplay binary1 = new SwitchDisplay();
        Assert.assertEquals("10111", binary1.toBinary(23));
        Assert.assertEquals("1000110111", binary1.toBinary(567));
        Assert.assertEquals("10001100101000", binary1.toBinary(9000));
        Assert.assertEquals("1001001", binary1.toBinary(73));

    }

    @org.junit.Test
    public void testSwitchDisplayOctal(){

        SwitchDisplay octal1 = new SwitchDisplay();
        Assert.assertEquals("27", octal1.toOctal(23));
        Assert.assertEquals("173", octal1.toOctal(123));
        Assert.assertEquals("1067", octal1.toOctal(567));
        Assert.assertEquals("21460", octal1.toOctal(9008));


    }

    @org.junit.Test
    public void testSwitchDisplayHex(){

        SwitchDisplay hex1 = new SwitchDisplay();
        Assert.assertEquals("17", hex1.toHex(23));
        Assert.assertEquals("1cb", hex1.toHex(459));
        Assert.assertEquals("30c", hex1.toHex(780));
        Assert.assertEquals("2d", hex1.toHex(45));
    }

}


