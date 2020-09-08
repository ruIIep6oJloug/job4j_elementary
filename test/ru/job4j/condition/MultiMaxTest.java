package ru.job4j.condition;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class MultiMaxTest {

    @Test
    public void firstMax() {
        int result = MultiMax.max(10, 5, 1);
        assertThat(result, is(10));
    }

    @Test
    public void secondMax() {
        int result = MultiMax.max(10, 50, 1);
        assertThat(result, is(50));
    }

    @Test
    public void thirdMax() {
        int result = MultiMax.max(1, 50, 100);
        assertThat(result, is(100));
    }

    @Test
    public void allEq() {
        int result = MultiMax.max(1, 1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void firstEqSecond() {
        int result = MultiMax.max(10, 10, 1);
        assertThat(result, is(10));
    }

    @Test
    public void firstEqThird() {
        int result = MultiMax.max(100, 1, 100);
        assertThat(result, is(100));
    }

    @Test
    public void secondEqThird() {
        int result = MultiMax.max(1, 100, 100);
        assertThat(result, is(100));
    }
}