package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.LogFunctions;
import org.junit.Assert;

public class LogFunctionsTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }
    @org.junit.After
    public void tearDown() throws Exception{
    }
    @org.junit.Test
    public void testLogFunctionsLog(){
        LogFunctions log1 = new LogFunctions();
        Assert.assertEquals(0.7781512503836436, log1.log(6), 0.01);
        Assert.assertEquals(1.65321251378, log1.log(45), 0.01);
        Assert.assertEquals(-0.5376020021, log1.log(0.29), 0.01);
        Assert.assertEquals(0.19865708695, log1.log(1.58), 0.01);
    }
    @org.junit.Test
    public void testLogFunctionsInverseLog(){
        LogFunctions inverse1 = new LogFunctions();
        Assert.assertEquals(10000, inverse1.inverseLog(4), 0.01);
        Assert.assertEquals(1.58489319246, inverse1.inverseLog(0.2), 0.01);
        Assert.assertEquals(1.20226443462, inverse1.inverseLog(0.08), 0.01);
        Assert.assertEquals(15.8489319246, inverse1.inverseLog(1.2), 0.01);
    }
    @org.junit.Test
    public void testLogFunctionsNaturalLog() {
        LogFunctions natLog1 = new LogFunctions();
        Assert.assertEquals(2.99573227355, natLog1.naturalLog(20), 0.01);
        Assert.assertEquals(-1.38629436112, natLog1.naturalLog(0.25), 0.01);
        Assert.assertEquals(1.5260563035, natLog1.naturalLog(4.6), 0.01);
        Assert.assertEquals(-0.22314355131, natLog1.naturalLog(0.8), 0.01);
    }
    @org.junit.Test
    public void testLogFunctionsInverseNaturalLog() {
        LogFunctions invNatLog1 = new LogFunctions();
        Assert.assertEquals(1.10517091808, invNatLog1.inverseNaturalLog(0.1), 0.01);
        Assert.assertEquals(1.34985880758, invNatLog1.inverseNaturalLog(0.3), 0.01);
        Assert.assertEquals(1202604.28416, invNatLog1.inverseNaturalLog(14), 0.01);
        Assert.assertEquals(11.0231763806, invNatLog1.inverseNaturalLog(2.4), 0.01);
    }
}
