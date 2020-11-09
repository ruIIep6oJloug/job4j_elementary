package ru.job4j.array;

import static org.hamcrest.Matchers.is;
import org.junit.Test;

import static org.junit.Assert.*;

public class SkipNegativeTest {

    @Test
    public void skip() {
        int[][] in = {
                {1, -2, 5, -7},
                {1, 2, 7, 0},
                {-4, 5, -8, 2}
        };
        int[][] expect = {
                {1, 0, 5, 0},
                {1, 2, 7, 0},
                {0, 5, 0, 2}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }
}