package com.zipcodewilmington.scientific_calculator;
import org.junit.Test;
import org.junit.Assert;

public class ExponentsTest {


    @Test
    public void squareTest1(){
        Double expected = 1.0;
        Double actual = Math.pow( 1.0 , 2.0);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void squareTest2() {
        Double expected = 100.0;
        Double actual = Math.pow( 10.0 , 2.0);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void squareTest3() {
        Double expected = 25.0;
        Double actual = Math.pow( 5.0 , 2.0);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void cubedTest1(){
        Double expected = 8.0;
        Double actual = Math.pow( 2.0 , 3.0);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void cubedTest2(){
        Double expected = 1.0;
        Double actual = Math.pow( 1.0 , 3.0);
        Assert.assertEquals(expected, actual);


    }
    @Test
    public void cubedTest3(){
        Double expected = 1000.0;
        Double actual = Math.pow( 10.0 , 3.0);
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void sqrtTest1(){
        Double expected = 10.0;
        Double actual = Math.pow( 100.0 , 0.5);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void sqrtTest2(){
        Double expected = 7.0;
        Double actual = Math.pow( 49.0 , 0.5);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void sqrtTest3(){
        Double expected = 5.0;
        Double actual = Math.pow( 25 , 0.5);
        Assert.assertEquals(expected, actual);

    }





}


