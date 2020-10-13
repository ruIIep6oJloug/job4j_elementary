package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while ((amount < salary) & (amount > 0)) {
            amount = (int) (((amount / 100) * percent) + amount - salary);
            if (amount < salary) {
                year++;
            }
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(Mortgage.year(100, 120, 50));
    }
}
