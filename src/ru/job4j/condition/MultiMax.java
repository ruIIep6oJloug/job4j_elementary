package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second && third < first) {
            result = first;
        }
         else if (second > first && third < second) {
            result = second;
        }
        return result;
    }

    public static void main(String[] args) {
        int rsl = MultiMax.max(5, 8, -11);
        System.out.println(rsl);
    }
}
