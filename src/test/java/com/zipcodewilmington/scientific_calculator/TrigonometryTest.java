package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.OperationClasses.Trigonometry;
import org.junit.Test;
import org.junit.Assert;


/**
 * Created by leon on 2/9/18.
 */
public class TrigonometryTest {

    @Test
    public void tangentTest() {
        Double expected = -1.995200412208242;
        Double actual = Trigonometry.tangent(90.0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void tangentTest2() {
        Double expected = 0.0;
        Double actual = Trigonometry.tangent(0.0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void tangentTest3() {
        Double expected = 2.185039863261519;
        Double actual = Trigonometry.tangent(-2.0);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void sineTest() {
        Double expected = 0.8939966636005579;
        Double actual = Trigonometry.sine(90.0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sineTest2() {
        Double expected = 0.0;
        Double actual = Trigonometry.sine(0.0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void sineTest3() {
        Double expected = -0.9880316240928618;
        Double actual = Trigonometry.sine(30.0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void cosineTest() {
        Double expected = 1.0;
        Double actual = Trigonometry.cosine(0.0);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void cosineTest2() {
        Double expected = 0.5253219888177297;
        Double actual = Trigonometry.cosine(45.0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void cosineTest3() {
        Double expected = -0.4480736161291701 ;
        Double actual = Trigonometry.cosine(90.0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inverseSinTest() {
        Double expected = 0.0  ;
        Double actual = Math.asin(0.0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inverseSinTest2() {
        Double expected = 1.5707963267948966  ;
        Double actual = Math.asin(1.0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inverseSinTest3() {
        Double expected = 0.5235987755982989 ;
        Double actual = Math.asin(0.5);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void inverseCosTest() {
        Double expected =  1.0471975511965979 ;
        Double actual = Math.acos(0.5);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void inverseCosTest2() {
        Double expected = 1.5707963267948966 ;
        Double actual = Math.acos(0.0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void inverseCosTest3() {
        Double expected = 2.0943951023931957  ;
        Double actual = Math.acos(-0.5);
        Assert.assertEquals(expected, actual);
    }


}

