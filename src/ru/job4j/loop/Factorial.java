package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (result != 0) {
                result = result * i;
            } else {
                result = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(10));
    }
}
