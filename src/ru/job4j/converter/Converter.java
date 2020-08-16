package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
         return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int one = 140;
        int two = 2;
        int three = rubleToDollar(one);
        boolean four = two == three;
        System.out.println("140 rubles are 2. Test result : " + four);
    }
}
