package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Shapes;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ShapesTest {
    Shapes s = new Shapes();
    public ShapesTest(){}
    //quad
    @Test
    public void quadTest(){
        assertEquals(4, s.quadArea(2,2), 0.01);
    }
    @Test
    public void quadTest1(){
        assertEquals(10, s.quadArea(10, 1), 0.01);
    }

    //triangle
    @Test
    public void triTest1(){
        assertEquals(10, s.triangleArea(2,10), 0.01);
    }
    @Test
    public void triTest2(){
        assertEquals(12, s.triangleArea(3, 8), 0.01);
    }
    //circle
    @Test
    public void cirTest1(){
        assertEquals(12.56, s.circleArea(2), 0.01);
    }
    @Test
    public void cirTest2(){
        assertEquals(28.27, s.circleArea(3), 0.01);
    }
}
