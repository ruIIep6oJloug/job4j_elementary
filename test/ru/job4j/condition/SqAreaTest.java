package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void squaretest() {
        int p = 6;
        int k = 2;
        int expected = 2;
        int out = SqArea.square(p, k);
        Assert.assertEquals(expected, out);
    }
}