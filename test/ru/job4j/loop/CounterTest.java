package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumberFromOnToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 11);
        int expected = 30;
        assertThat(rsl, is(expected));
    }
}