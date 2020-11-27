package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

       @Test
    public void rangeTrue() {
        int[] input = {5, 4, 3, 2};
        int value = 3;
        int start = 1;
        int finish = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void rangeFalse() {
        int[] input = {5, 4, 3, 2};
        int value = 6;
        int start = 1;
        int finish = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}