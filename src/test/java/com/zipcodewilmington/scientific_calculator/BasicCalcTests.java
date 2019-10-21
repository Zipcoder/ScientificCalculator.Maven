package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.BasicCalculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class BasicCalcTests {

    private BasicCalculator calc;

    @Before
    public void setup() {
        calc = new BasicCalculator();
    }


    @Test
    public void addTest1(){

        calc.add( 101.75, 78.654);

        Assert.assertEquals(180.404,calc.getDoubleResult() , 0);
    }

    @Test
    public void addTest2(){

        calc.add((double) 9, (double) 5);

        Assert.assertEquals(14,calc.getDoubleResult() , 0);
    }

    @Test
    public void addTest3(){

        calc.add( 100045.875,438294.54);

        Assert.assertEquals(538340.415,calc.getDoubleResult() , 0);
    }

    @Test
    public void subtractTest1(){

        calc.subtract( 690045.875, 438294.54);

        Assert.assertEquals(251751.335,calc.getDoubleResult() , .1);
    }

    @Test
    public void subtractTest2(){

        calc.subtract( 100045.875, 438294.54);

        Assert.assertEquals(-338248.665,calc.getDoubleResult() , .1);

    }

    @Test
    public void subtractTest3(){

        calc.subtract(86045.875, 38294.54);

        Assert.assertEquals(47751.335,calc.getDoubleResult() , .1);
    }

    @Test
    public void multiplyTest1(){

        calc.multiply( 5.5, 5.5);

        Assert.assertEquals(30.25,calc.getDoubleResult() , 0.1);

    }

    @Test
    public void multiplyTest2(){

        calc.multiply( (double) 786, (double) 384);

        Assert.assertEquals(301824,calc.getDoubleResult() , .1);

    }

    @Test
    public void multiplyTest3(){

        calc.multiply( 4083.6, 3834.7);

        Assert.assertEquals(15659380.9,calc.getDoubleResult() , .1 );
    }

    @Test
    public void divideTest1(){

        calc.divide( 40.6, 34.7);

        Assert.assertEquals(1.17002882,calc.getDoubleResult() , .1);

    }

    @Test
    public void divideTest2(){
        calc.divide((double) 25, (double) 5);

        Assert.assertEquals(5,calc.getDoubleResult() , .1);
    }

    @Test
    public void divideTest3(){
        calc.divide( 386442.6, 29742.2);

        Assert.assertEquals(12.9930738,calc.getDoubleResult() , 0.1);
    }

}
