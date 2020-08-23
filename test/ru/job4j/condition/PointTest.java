package ru.job4j.condition;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceTest() {
        int inxone = 2;
        int inyone = 5;
        int inxtwo = 5;
        int inytwo = 7;
        double expected = 3.605551275463989;
        double out = Point.distance(inxone, inyone, inxtwo, inytwo);
        assertThat(out, is(expected));
    }
}