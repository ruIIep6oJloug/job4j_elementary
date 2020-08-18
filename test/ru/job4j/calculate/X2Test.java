package ru.job4j.calculate;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class X2Test {

    @Test
    public void whenBCZero() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenOne() {
        int qa = 1;
        int wa = 1;
        int ea = 1;
        int ra = 1;
        int ta = 3;
        int ya = X2.calc(qa, wa, ea, ra);
        assertThat(ya, is(ta));
    }

    @Test
    public  void whenTwo() {
        int qs = 0;
        int ws = 1;
        int es = 1;
        int rs = 1;
        int ts = 2;
        int ys = X2.calc(qs, ws, es, rs);
        assertThat(ys, is(ts));
    }

    @Test
    public  void whenThree() {
        int az = 1;
        int bz = 1;
        int cz = 0;
        int xz = 1;
        int yz = 2;
        int result = X2.calc(az, bz, cz, xz);
        assertThat(result, is(yz));
    }

    @Test
    public void whenFour() {
        int aq = 1;
        int bq = 1;
        int cq = 1;
        int xq = 0;
        int ogid = 1;
        int resul = X2.calc(aq, bq, cq, xq);
        assertThat(resul, is(ogid));
    }
}