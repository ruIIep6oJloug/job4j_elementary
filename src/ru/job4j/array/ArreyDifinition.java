package ru.job4j.array;

public class ArreyDifinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        String[] name = new String[4];
        name[0] = "Петя";
        name[1] = "Вася";
        name[2] = "Саша";
        name[3] = "Миша";
        System.out.println("Размер массива ages: " + ages.length);
        System.out.println("Размер массива surname: " + surname.length);
        System.out.println("Размер масива prices: " + prices.length);
        System.out.println(name[0]);
    }
}
