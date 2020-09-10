package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            sum = sum + index;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int  cikl = start; cikl <= finish; cikl++) {
            if (cikl % 2 == 0) {
                sum = sum + cikl;
            }
        }
        return sum;
    }

    public static  void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 8));

        System.out.println(sumByEven(2, 52));
    }
}
