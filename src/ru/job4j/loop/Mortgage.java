package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
            while (amount < salary) {
                year++;
                amount = ((amount / 100) * percent) + amount - salary;
            }
        return year;
    }

    public static void main(String[] args) {
        year(1000, 1200, 1);
    }
}
