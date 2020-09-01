package ru.job4j.condition;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(9, 4, 2);
        assertThat(result, is(9));
    }
}