package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.ScientificCalculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class ScientificCalcTests {

    private ScientificCalculator sCalc;

    @Before
    public void setup(){
        sCalc = new ScientificCalculator();
    }

    @Test
    public void squareTest1(){

        sCalc.square((double) 100);

        Assert.assertEquals(10000,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void squareTest2(){

        sCalc.square((double) 10);

        Assert.assertEquals(100,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void squareTest3(){

        sCalc.square((double) 5000);

        Assert.assertEquals(25000000,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void squareRootTest1(){

        sCalc.squareRoot((double)(-1));

        Assert.assertEquals("ERROR", sCalc.getStringResult());

    }

    @Test
    public void squareRootTest2(){

        sCalc.squareRoot((double) 500);

        Assert.assertEquals(22.36067977,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void squareRootTest3(){

        sCalc.squareRoot((double) 1000);

        Assert.assertEquals(31.6227766,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void inverseTest1(){

        sCalc.inverse((double) 2);

        Assert.assertEquals(.5,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void inverseTest2(){

        sCalc.inverse((double) 10);

        Assert.assertEquals(.1,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void inverseTest3(){

        sCalc.inverse((double) 1000);

        Assert.assertEquals(.001,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void switchSignTest1(){

        sCalc.switchSign((double) 100);

        Assert.assertEquals(-100,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void switchSignTest2(){

        sCalc.switchSign((double) -10);

        Assert.assertEquals(10,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void switchSignTest3(){

        sCalc.switchSign((double) -5000);

        Assert.assertEquals(5000,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void sineTest1(){

        sCalc.sine((double) 10);

        Assert.assertEquals(-0.5440211108893698,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void sineTest2(){

        sCalc.sine((double) 100);

        Assert.assertEquals(-0.50636564111,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void sineTest3(){

        sCalc.sine((double) 50);

        Assert.assertEquals(-0.2623748537,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void cosineTest1(){

        sCalc.cosine((double) 10);

        Assert.assertEquals(-0.83907152907,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void cosineTest2(){

        sCalc.cosine((double) 50);

        Assert.assertEquals(0.96496602849,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void cosineTest3(){

        sCalc.cosine((double) 100);

        Assert.assertEquals(0.86231887228,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void tangentTest1(){

        sCalc.tangent((double) 10);

        Assert.assertEquals(0.64836082745,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void tangentTest2(){

        sCalc.tangent((double) 50);

        Assert.assertEquals(-0.27190061199,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void tangentTest3(){

        sCalc.tangent((double) 100);

        Assert.assertEquals(-0.58721391515,sCalc.getDoubleResult() , 0.1);

    }

    @Test
    public void inverseSineTest1(){

        sCalc.inverseSine((double) 1);

        Assert.assertEquals(1.57079633,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void inverseSineTest2(){

        sCalc.inverseSine((double) .5);

        Assert.assertEquals(0.52359878,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void inverseSineTest3(){

        sCalc.inverseSine((double) .8);

        Assert.assertEquals(0.92729522,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void inverseCosineTest1(){

        sCalc.inverseCosine((double) 1);

        Assert.assertEquals(0,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void inverseCosineTest2(){

        sCalc.inverseCosine((double) .5);

        Assert.assertEquals(1,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void inverseCosineTest3(){

        sCalc.inverseCosine((double) .8);

        Assert.assertEquals(.6,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void inverseTangentTest1(){

        sCalc.inverseTangent((double) .8);

        Assert.assertEquals(0.67474094,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void inverseTangentTest2(){

        sCalc.inverseTangent((double) 1);

        Assert.assertEquals(0.78539816,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void inverseTangentTest3(){

        sCalc.inverseTangent((double) .6);

        Assert.assertEquals(0.5404195,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void FactorialTest1(){

        sCalc.factorial((double) 10);

        Assert.assertEquals(3628800,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void FactorialTest2(){

        sCalc.factorial((double) 5);

        Assert.assertEquals(120,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void FactorialTest3(){

        sCalc.factorial((double) 8);

        Assert.assertEquals(40320,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void logTest1(){

        sCalc.log((double) 10);

        Assert.assertEquals(2.303,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void logTest2(){

        sCalc.log((double) 25);

        Assert.assertEquals(3.219,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void logTest3(){

        sCalc.log((double) 5);

        Assert.assertEquals(1.609,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void exponentTest1(){

        sCalc.exponent((double) 10, 2.1);

        Assert.assertEquals(125.893,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void exponentTest2(){

        sCalc.exponent((double) 10, (double) 0);

        Assert.assertEquals(1,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void exponentTest3(){

        sCalc.exponent((double) 0, (double)( 6));

        Assert.assertEquals(0,sCalc.getDoubleResult() , 0);

    }

    @Test
    public void inverselogTest1(){

        sCalc.inverselog((double) 10);

        Assert.assertEquals(22026.4658,sCalc.getDoubleResult() , 0.1);

    }

    @Test
    public void inverselogTest2(){

        sCalc.inverselog((double) 15);

        Assert.assertEquals(3269017.37,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void inverselogTest3(){

        sCalc.inverselog((double) 5);

        Assert.assertEquals(148.413,sCalc.getDoubleResult() , .1);

    }
    @Test
    public void log10Test1(){

        sCalc.log10((double) 5);

        Assert.assertEquals(0.6989700043360187,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void log10Test2(){

        sCalc.log10((double) 10);

        Assert.assertEquals(1,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void log10Test3(){

        sCalc.log10((double) 15);

        Assert.assertEquals(1.1760912590556811,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void inverseLog10Test1(){

        sCalc.inverseLog10((double) 5);

        Assert.assertEquals(100000,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void inverseLog10Test2(){

        sCalc.inverseLog10((double) 1);

        Assert.assertEquals(10,sCalc.getDoubleResult() , .1);

    }

    @Test
    public void inverseLog10Test3(){

        sCalc.inverseLog10((double) 8);

        Assert.assertEquals(100000000,sCalc.getDoubleResult() , .1);

    }

}
