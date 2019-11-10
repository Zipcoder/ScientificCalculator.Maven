package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.OperationClasses.Logarithmic;
import org.junit.Assert;
import org.junit.Test;

public class TestLogarithmic {

    @Test
    public void naturalLogTest() {
        Double expected = 0D;
        Double actual = Logarithmic.naturalLog(1D);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void naturalLogTest2() {
        Double expected = 2.0794415416798357;
        Double actual = Logarithmic.naturalLog(8D);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void naturalLogTest3() {
        Double expected = 1.5040773967762742;
        Double actual = Logarithmic.naturalLog(4.5);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void logBaseTenTest() {
        {
            Double expected = 1.6094379124341003;
            Double actual = Logarithmic.naturalLog(5D);
            Assert.assertEquals(expected, actual);

        }

    }

    @Test
    public void logBaseTenTest2() {
        {
            Double expected = 2.70805020110221;
            Double actual = Logarithmic.naturalLog(15D);
            Assert.assertEquals(expected, actual);

        }

    }

    @Test
    public void logBaseTenTest3() {
        {
            Double expected = 3.054001181677967;
            Double actual = Logarithmic.naturalLog(21.2);
            Assert.assertEquals(expected, actual);

        }

    }
}
