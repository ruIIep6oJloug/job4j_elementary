package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int index = 2; index <= number; index++) {
            index++;
            if (number % index == 0) {
                prime = false;
            } else  {
                prime = true;
            }
            }
            return prime;
    }

    public static void main(String[] args) {
        System.out.println(check(3));
        System.out.println(check(5));
        System.out.println(check(9));
    }
}
