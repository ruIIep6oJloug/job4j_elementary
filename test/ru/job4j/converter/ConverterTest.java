package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

        @Test
    public void whenConverter140RblThenEuro() {
            int in =  140;
            int expected = 2;
            int out = Converter.rubleToEuro(in);
            Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
            int one = 180;
            int two = 3;
            int three = Converter.rubleToDollar(one);
            Assert.assertEquals(two, three);
    }
}