package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.OperationClasses.Misc;
import org.junit.Assert;
import org.junit.Test;

public class TestMisc {
    @Test
    public void absValTest()
    {
        Double expected = 54.5;
        Double actual = Misc.absVal(-54.5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void absValTest2 ()
    {
        Double expected = 20D;
        Double actual = Misc.absVal(20D);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void absValTest3 ()
    {
        Double expected = 82D;
        Double actual = Misc.absVal(-82D);
        Assert.assertEquals(expected, actual);
    }
}
