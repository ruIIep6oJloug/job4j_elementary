package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'x', 'x', 'x'},
                {' ', ' ', ' '}
        };
        boolean result = MatrixCheck.monoHorizontal(input, 0);
        assertThat(result, is(false));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'x'},
                {' ', ' ', 'x'},
                {' ', ' ', 'x'}
        };
        boolean result = MatrixCheck.momoVertical(input, 0);
        assertThat(result, is(false));
    }

    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'x', ' ', ' '},
                {' ', 'x', ' '},
                {' ', ' ', 'x'}
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'x', 'x', 'x'};
        assertThat(result, is(expect));
    }

    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'x', ' ', ' '},
                {' ', ' ', 'x', ' ', ' '},
                {' ', ' ', 'x', ' ', ' '},
                {' ', ' ', 'x', ' ', ' '},
                {' ', ' ', 'x', ' ', ' '}
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataMonoByTrueThenfalse() {
        char[][] input = {
                {' ', ' ', 'x', ' ', ' '},
                {' ', ' ', 'x', ' ', ' '},
                {' ', 'x', ' ', ' ', ' '},
                {' ', ' ', 'x', ' ', ' '},
                {' ', ' ', 'x', ' ', ' '}
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'x', 'x', 'x', 'x', 'x'},
                {' ', ' ', 'x', ' ', ' '},
                {' ', ' ', 'x', ' ', ' '}
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }
}