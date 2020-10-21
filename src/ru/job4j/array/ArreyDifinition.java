package ru.job4j.array;

public class ArreyDifinition {
    public static void main(String[] args) {
        String[] name = new String[4];
        name[0] = "Петя";
        name[1] = "Вася";
        name[2] = "Саша";
        name[3] = "Миша";
        for (int index = 0; index < name.length; index++) {
            System.out.println(name[index]);
        }
    }
}
