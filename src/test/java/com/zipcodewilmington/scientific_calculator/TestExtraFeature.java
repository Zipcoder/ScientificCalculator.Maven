package com.zipcodewilmington.scientific_calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import static com.zipcodewilmington.scientificcalculator.ExtraFeature.*;

public class TestExtraFeature {
    @Before
    public void setUp() throws Exception {
        Thread.sleep(5000);
    }
    @Test
    public void testGetBestScoringWords() throws Exception {
        String expected = "{\"words\":[[\"WESTERN\",10],[\"NEWEST\",9],[\"RENEWS\",9]]}";
        String actual = getBestScoringWords("WESTERN");
        Assert.assertEquals(expected, actual);
    }
}
