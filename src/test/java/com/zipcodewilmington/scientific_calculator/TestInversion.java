package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Inversion;
import org.apache.commons.math3.util.Precision;
import org.junit.Test;
import org.junit.Assert;

import static org.apache.commons.math3.util.Precision.round;

public class TestInversion {


    @Test
    public void changeSignTest() {
        Double expected = -12D;
        Double actual = Inversion.changeSign(12D);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeSignTest2() {
        Double expected = -129.6;
        Double actual = Inversion.changeSign(129.6);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeSignTest3() {
        Double expected = 45D;
        Double actual = Inversion.changeSign(-45D);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inverseNumTest() {
        Double expected = 0.25;
        Double actual = Inversion.inverseNum(4D);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void inverseNumTest2() {
        Double expected = 4D;
        Double actual = Inversion.inverseNum(0.25);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inverseNumTest3() {
        Double expected = 0.1111111111111111;
        Double actual = Inversion.inverseNum(9D);
        //Precision.round(actual, 3, );
        Assert.assertEquals(expected, actual);
    }


    }
