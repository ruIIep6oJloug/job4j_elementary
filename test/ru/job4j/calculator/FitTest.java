package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manKg() {
        short in = 187;
        double ogid = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(ogid, out, 0.01);
    }

    @Test
    public void womanKg() {
        short one = 187;
        double ogidan = 88.55;
        double three = Fit.womanWeight(one);
        Assert.assertEquals(ogidan, three, 0.01);
    }
}